package cn.com.soframe.config;

import com.alibaba.fastjson.support.spring.FastJsonRedisSerializer;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

/**
 * @author fujh
 * Redis缓存配置:
 * @Configuration 定义SpringIOC容器
 * @ConditionalOnClass(RedisOperations.class) 指定类条件下进行注册容器下的Bean
 * @EnableConfigurationProperties(RedisOperations.class) 把@ConfigurationProperties注解的类进行了一次注册
 */
@Configuration
@ConditionalOnClass(RedisOperations.class)
@EnableConfigurationProperties(RedisOperations.class)
public class RedisConfig {

    /**
     * 定义RedisTemplate的单例
     * @ConditionalOnMissingBean 该注解设定在IOC容器中没有注册指定Bean 的ID 时进行组装
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(name = "redisTemplate")
    public RedisTemplate<Object,Object> redisTemplate(RedisConnectionFactory redisConnectionFactory){
        RedisTemplate<Object,Object> template = new RedisTemplate<Object,Object>();

        /**
         * 1、设置Redis的Key的序列化采用 org.springframework.data.redis.serializer.StringRedisSerializer
         */
        template.setKeySerializer(new StringRedisSerializer());
        template.setHashKeySerializer(new StringRedisSerializer());

        /**
         * 2、设置Redis的Value序列化采用 com.alibaba.fastjson.support.spring.FastJsonRedisSerializer
         */
        FastJsonRedisSerializer fastJsonRedisSerializer = new FastJsonRedisSerializer(Object.class);
        template.setValueSerializer(fastJsonRedisSerializer);
        template.setHashValueSerializer(fastJsonRedisSerializer);

        //3、生成Bean
        template.setConnectionFactory(redisConnectionFactory);

        return template;
    }

    /**
     * 该Bean可以理解为 RedisTemplates的补充，最大程度的减少了RedisTemplate的配置，使用效果一致
     * @param redisConnectionFactory
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(StringRedisTemplate.class)
    public StringRedisTemplate stringRedisTemplate(RedisConnectionFactory redisConnectionFactory){
        StringRedisTemplate template = new StringRedisTemplate();
        //生成Bean
        template.setConnectionFactory(redisConnectionFactory);
        return template;
    }

}
