package cn.com.soframe.kafka;

import cn.com.soframe.kafka.entity.KafkaMessage;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author fujh
 * @since 2020年9月7日19:55:13
 * Kafka测试类
 */
@SpringBootTest
public class KafkaTest {

    /**
     * 消息生产者
     */
    @Autowired
    private KafkaProducer producer;

    /**
     * 消息消费者（消息查看者）
     */
    @Autowired
    private KafkaConsumer consumer;

    /**
     * 测试发送消息
     */
    @Test
    public void sendMessage(){
        System.out.println("发送消息");
        producer.sendMessage(new KafkaMessage("helloworld"));
        System.out.println("接受消息");
    }
}
