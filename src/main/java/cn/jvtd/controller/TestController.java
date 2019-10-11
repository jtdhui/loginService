package cn.jvtd.controller;

import cn.jvtd.common.AcceptBean;
import cn.jvtd.common.ResultBean;
import cn.jvtd.common.ResultConstant;
import cn.jvtd.mapper.JvtdMobileMapper;
import cn.jvtd.util.RedisClientTemplate;
import cn.jvtd.util.RedisUtil;
import cn.jvtd.vo.JvtdMobileBeanVO;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping(value = "/test")
public class TestController {

    @Autowired
    RedisUtil redisUtil;

    @Autowired
    RedisClientTemplate redisClientTemplate;

    @Autowired
    JvtdMobileMapper jvtdMobileMapper;
    @GetMapping(value = "/testSet")
    public Object testSet(){
        boolean bl=  redisUtil.set("ok12","13552808569");
        System.out.print(bl);
        return bl;
    }


    @GetMapping(value = "/testClusterSet")
    public Object testClusterSet(){
        redisClientTemplate.setToRedis("clue12435",60,"Frank测试redis");
        System.out.println(redisClientTemplate.getRedis("Frank"));
        return null;
    }

    @PostMapping(value = "/testGetMobileList")
    @ResponseBody
    public ResultBean testGetMobileList(@RequestBody AcceptBean acceptData){
        Map<String,Object> map = (HashMap<String,Object>) acceptData.getData();
        Integer pageNumber = (Integer) map.get("pageNumber");
        Integer pageSize = (Integer) map.get("pageSize");
        PageHelper.startPage(pageNumber, pageSize, "score desc");
        JvtdMobileBeanVO jvtdMobileBeanVO=new JvtdMobileBeanVO();
        List<JvtdMobileBeanVO> mobileBeanList= jvtdMobileMapper.getMobileList(jvtdMobileBeanVO);
        PageInfo<JvtdMobileBeanVO> pageInfo = new PageInfo<JvtdMobileBeanVO>(mobileBeanList);
       return new ResultBean(ResultConstant.SUCCESS,pageInfo);
    }

}
