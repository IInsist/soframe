package cn.com.soframe.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author fujh
 * Redis缓存配置:
 * @Configuration 定义SpringIOC容器
 * @ConditionalOnClass(RedisOperations.class) 指定类条件下进行注册容器下的Bean
 * @EnableConfigurationProperties(RedisOperations.class)
 */
@Configuration
@ConditionalOnClass(RedisOperations.class)
@EnableConfigurationProperties(RedisOperations.class)
public class RedisConfig {

    /**
     * 定义RedisTemplate的单例
     * @return
     */
    @Bean
    public RedisTemplate<String,Object> redisTemplate(){
        return null;
    }

}
