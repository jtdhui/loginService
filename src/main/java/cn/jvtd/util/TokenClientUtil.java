package cn.jvtd.util;
import cn.jvtd.domain.SysUser;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.Date;
import java.util.UUID;

@Component
public class TokenClientUtil {

    @Autowired
    RedisClientTemplate redisTemplate;

    public void expireToken(String token) throws Exception {
        redisTemplate.deleteRedis(token);
    }
//
//    public static Map<String, Object> getUserInfo(String token) throws Exception {
//        IJDBCService jdbcService = (IJDBCService) SpringContextUtil.getBean("jdbcService");
//        String strSql = "select user_id,expire_time,brand_id from bop_sys_user_token_rela where token=?";
//        List<Object> paramList = new ArrayList<>();
//        paramList.add(token);
//        return jdbcService.selectFirstRecord(strSql, paramList);
//    }

    public SysUser getUserByToken(String token) throws Exception {
         String result= (String)redisTemplate.getRedis(token);
         SysUser sysUser = JSON.parseObject(result, new TypeReference<SysUser>() {});
         if (sysUser != null) {
              expireToken(token);
        }
        return sysUser;
    }

    public String saveAndGetToken(SysUser sysUser, int expireTime, String brandID) throws Exception {
        String s = UUID.randomUUID().toString().replace("-", "");
        String userToken = "_" + sysUser.getUserId() + "_" + s;
        String js=  JSON.toJSONString(sysUser);
        redisTemplate.setToRedis(userToken,expireTime,js);
        return userToken;
    }
//
//    /**
//     * 更新过期时间
//     */
    public  void refreshToken(String token, int expireInterval,SysUser sysUser) throws Exception {
        redisTemplate.setToRedis(token,expireInterval,sysUser);
    }
}