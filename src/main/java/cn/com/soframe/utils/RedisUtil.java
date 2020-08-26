package cn.com.soframe.utils;

import org.springframework.data.redis.core.RedisTemplate;

import javax.annotation.Resource;

/**
 * @author fujh
 * Redis缓存操作工具类<br>
 * 内部集成对Redis远程get、put、list等一一些列原生方法的优化改造
 */
public class RedisUtil {

    @Resource
    private RedisTemplate<String ,Object> redisTemplate;

}
