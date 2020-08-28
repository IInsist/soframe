package cn.com.soframe.redis;

import cn.com.soframe.utils.RedisUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author fujh
 * Redis的测试类
 */
@SpringBootTest
public class RedisTest {

    @Autowired
    RedisUtil redisUtil;

    @Test
    public void t1(){
        redisUtil.set("fujh","1540689207");
        String name = String.valueOf(redisUtil.get("fujh"));
        System.out.println(name);
    }
}
