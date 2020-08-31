package cn.com.soframe.utils;

import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.Set;

/**
 * @author fujh
 * Redis缓存操作工具类<br>
 * 内部集成对Redis远程get、set、list等一系列原生方法的优化改造
 */
@Component
public class RedisUtil {

    @Resource
    private RedisTemplate<String ,Object> redisTemplate;

    /**
     * 专门处理<String ,String>类型的缓存数据
     */
    @Resource
    private StringRedisTemplate stringRedisTemplate;

    /**
     * 通过key获取值
     * @param key
     * @return
     */
    public Object get(String key){
        return key == null ? null : redisTemplate.opsForValue().get(key);
    }

    /**
     * 设置值
     * @param key
     * @param value
     * @return
     */
    public boolean set(String key,Object value){
        try {
            redisTemplate.opsForValue().set(key,value);
            return true;
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 通过key删除，可多个
     * @param key
     */
    public void del(String... key){
        if(key!=null && key.length>0){
            if(key.length==1){
                redisTemplate.delete(key[0]);
            }else{
                redisTemplate.delete(CollectionUtils.arrayToList(key));
            }
        }
    }

    /**
     * 判断key是否存在
     * @param key
     * @return
     */
    public boolean hasKey(String key){
        try {
            return redisTemplate.hasKey(key);
        }catch (Exception e){
            return false;
        }
    }

    /**
     * 模糊查找key
     * @param keys
     * @return
     */
    public Set<String> keys(String keys){
        try {
            return redisTemplate.keys(keys);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }

}
