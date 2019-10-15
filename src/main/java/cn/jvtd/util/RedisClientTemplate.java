package cn.jvtd.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RedisClientTemplate {
    private static final Logger log= LoggerFactory.getLogger(RedisClientTemplate.class);

    @Autowired
    private JedisClusterConfig jedisClusterConfig;

    public boolean setToRedis(String key,int expire,Object value){
        try {
//            String str=jedisClusterConfig.getJedisCluster().set(key, String.valueOf(value));
            String str=jedisClusterConfig.getJedisCluster().setex(key,expire,String.valueOf(value));
            if("OK".equals(str))
                return true;
        }catch (Exception ex){
            log.error("setToRedis:{Key:"+key+",value"+value+"}",ex);
        }
        return false;
    }

    public Object getRedis(String key){
        String str=null;
        try {
            str=jedisClusterConfig.getJedisCluster().get(key);
        }catch (Exception ex){
            log.error("getRedis:{Key:"+key+"}",ex);
        }
        return str;
    }

    public Object deleteRedis(String key){
        Long str=null;
        try {
            str=jedisClusterConfig.getJedisCluster().del(key);
        }catch (Exception ex){
            log.error("getRedis:{Key:"+key+"}",ex);
        }
        return str;
    }

}
