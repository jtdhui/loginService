package cn.jvtd.controller;

import cn.jvtd.common.AcceptBean;
import cn.jvtd.common.ResultBean;
import cn.jvtd.common.ResultConstant;
import cn.jvtd.domain.SysFunc;
import cn.jvtd.domain.SysRole;
import cn.jvtd.domain.SysUser;
import cn.jvtd.service.ISysFuncService;
import cn.jvtd.service.ISysRoleService;
import cn.jvtd.service.ISysUserService;
import cn.jvtd.util.*;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.RedisConnectionFailureException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.IOException;
import java.util.*;

/**
 *
 * 用户登录，忘记密码
 */
@Controller
@RequestMapping("/api/user")
public class UserLoginAction {
    private Log log = LogFactory.getLog(this.getClass());
    @Autowired
    RedisClientTemplate redisTemplate;

    @Autowired
    ISysUserService sysUserService;

    @Autowired
    ISysRoleService sysRoleService;

    @Autowired
    ISysFuncService sysFuncService;

    @Autowired
    TokenClientUtil tokenClientUtil;
    /**
     * 获取手机验证码
     *
     * @param
     * @return
     */
    @RequestMapping("findCode")
    @ResponseBody
    public ResultBean findCode(@RequestBody AcceptBean acceptData) throws IOException {
        ResultBean resultBean = null;
        try {
            String version =acceptData.getVersion();
            Map<String,Object> amap = (HashMap<String,Object>) acceptData.getData();
            String mobilePhone = Tools.trimToEmpty(amap.get("mobilePhone"));
            if (mobilePhone == null && mobilePhone.equals("")) {
                resultBean = ResultBean.createResult("1003", "请输入您的手机号", new JSONObject());
            } else {
                //6位随机数
                String randNum = "8" + RandomStringUtils.randomNumeric(5);
                String sendSms = SmsUtil.SendSms(mobilePhone, "【蜜糖折扣】验证码：" + Integer.parseInt(randNum));
                log.info(sendSms);
                HashMap map = new HashMap();
                map.put("verifyCode", Integer.parseInt(randNum));
                if (sendSms != null && !sendSms.equals("")) {
                    resultBean = ResultBean.createResult("1000", "发送验证码成功", map);
                } else {
                    resultBean = ResultBean.createResult("1002", "发送验证码失败", new JSONObject());
                }
                // 存入redis缓存
                redisTemplate.setToRedis(mobilePhone, 5 * 60,String.valueOf(randNum));
            }
        } catch (RedisConnectionFailureException e1) {
            log.error("redis 链接异常", e1);
            // redis 链接异常，正常返回验证码
            return resultBean;
        } catch (Exception e) {
            log.error("error", e);
            resultBean = ResultBean.createResultByException();
        }
        return resultBean;
    }

    /**
     * 用户登录:手机号/验证码登录或注册
     *
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping("/userLogin")
    @ResponseBody
    public ResultBean userLogin(@RequestBody AcceptBean acceptData) throws Exception {
        ResultBean resultBean = null;
        try {
            String version =acceptData.getVersion();
            Map<String,Object> amap = (HashMap<String,Object>) acceptData.getData();
            String verify = Tools.trimToEmpty(amap.get("verify"));
            String mobilePhone = Tools.trimToEmpty(amap.get("mobilePhone"));
            String verificationCode = Tools.trimToEmpty(amap.get("verificationCode"));
            String password = Tools.trimToEmpty(amap.get("password"));
            SysUser sysUser=new SysUser();
            sysUser.setMobile(mobilePhone);
            List<SysUser> userList = sysUserService.selectUserList(sysUser);
            if ("1".equals(verify)) {
                //验证码登录
                String code = String.valueOf(redisTemplate.getRedis(mobilePhone));
                if (mobilePhone == null && "".equals(mobilePhone)) {
                    resultBean = ResultBean.createResult("1003", "请输入您的手机号", new JSONObject());
                } else if (verificationCode == null && "".equals(verificationCode)) {
                    resultBean = ResultBean.createResult("1003", "请输入验证码", new JSONObject());
                } else if (!code.equals(verificationCode)) {
                    resultBean = ResultBean.createResult("1006", "验证码错误", new JSONObject());
                } else {
                    if (userList != null && userList.size()>0) {
                        resultBean = ResultBean.createResult("1002", "登录成功",userList.get(0));
                    }else{
                        sysUser.setCreateBy(0L);
                        sysUser.setCreateTime(new Date());
                        sysUser.setUpdateTime(new Date());
                        sysUser.setUpdateBy(0L);
                        sysUser.setUserName("测试用户");
                        // 默认男性
                        sysUser.setTitle("M");
                        sysUser.setStatus("1");
                        int eamilCode = (int) (1 + Math.random() * 1000000);
                        sysUser.setEmail(eamilCode + "@test.com");
                        sysUser.setPwd("123456");
                        sysUser.setHashPwd(AccreditUtil.encodePass(sysUser.getEmail()+"",sysUser.getPwd()));// 初始密码加密
                        int i = sysUserService.addUser(sysUser);
                        if (i > 0) {
                            resultBean = ResultBean.createResult("1002", "注册成功", new JSONObject());
                        } else {
                            resultBean = ResultBean.createResult("1002", "注册失败", new JSONObject());
                        }
                    }
                }
            } else if ("2".equals(verify)) {
                //密码登录
                if ((mobilePhone == null && mobilePhone.equals("")) || (password == null && password.equals(""))) {
                    resultBean = ResultBean.createResult("1003", "请输入您的手机号/密码", new JSONObject());
                } else {
                    if (userList != null&&userList.size()>0) {
                        SysUser user1=userList.get(0);
                        //判断密码正确性
                        String hashPwd = AccreditUtil.encodePass(user1.getEmail().toString(),password);// 加密后的登录密码
                        System.out.print(hashPwd);
                        String hashPwd2 = user1.getHashPwd();
                        System.out.print(hashPwd2);
                        if (hashPwd.equals(user1.getHashPwd())) {
                            log.info("密码输入登录成功");
                            //查询当前登录人的所属角色
                            List<SysRole> userRoles= sysRoleService.getUserAllRoles(user1.getUserId());
                            // 1.获得当前用户的所有系统功能
                            Map<String,SysFunc> userRoleAllFuncMap = new HashMap<String,SysFunc>();
                            if ((userRoles != null) && (userRoles.size() > 0)) {
                                for (int iRIdx = 0; iRIdx < userRoles.size(); iRIdx++) {
                                    List<SysFunc> roleFuncList= sysFuncService.getAllFuncByRoleId(userRoles.get(iRIdx).getRoleId());
                                    if ((roleFuncList != null) && (roleFuncList.size() > 0)) {
                                        for (int iFIdx = 0; iFIdx < roleFuncList.size(); iFIdx++) {
                                            userRoleAllFuncMap.put(roleFuncList.get(iFIdx).getFuncId(), roleFuncList.get(iFIdx));
                                        }
                                    }
                                }
                            }
                            List<SysFunc> userRoleAllFuncs = new ArrayList<SysFunc>(userRoleAllFuncMap.values());
                            Collections.sort(userRoleAllFuncs);
                            SysFunc sysFunc= BuildTree.buildTree(userRoleAllFuncs);
                            int expireTime = 7 * 24 * 3600 * 1000;// 过期时间7天
                            String userToken = tokenClientUtil.saveAndGetToken(user1, expireTime,"3");
                            Map<String,Object> map=new HashMap<String,Object>();
                            map.put("userInfo",user1);
                            map.put("funcs",sysFunc);
                            map.put("userToken",userToken);
                            return new ResultBean(ResultConstant.SUCCESS,map);
                        } else {
                            resultBean = ResultBean.createResult("1003", "手机号/密码错误", new JSONObject());
                         }

                    } else {
                        resultBean = ResultBean.createResult("1004", "用户未注册，请先去快捷注册", new JSONObject());
                    }
                }
            }
        } catch (Exception e) {
            log.error("查询出错", e);
            resultBean = ResultBean.createResultByException();
        }
        return resultBean;
    }
   /**
     *
     *
     * @param
     * @return
     * @throws Exception
     */
    @RequestMapping("/searchUser")
    @ResponseBody
    public ResultBean searchUser(@RequestBody AcceptBean acceptData) throws Exception {
        ResultBean resultBean = null;
        String version =acceptData.getVersion();
        Map<String,Object> amap = (HashMap<String,Object>) acceptData.getData();
        return resultBean;
    }

}
