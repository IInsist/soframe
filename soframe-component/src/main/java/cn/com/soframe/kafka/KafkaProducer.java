package cn.com.soframe.kafka;

import lombok.extern.slf4j.Slf4j;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author fujh
 * @since 2020年9月7日16:30:57
 * Kafka消息生产者
 */
@Component
@Slf4j
public class KafkaProducer {

    @Resource
    private KafkaTemplate<String ,String> kafkaTemplate;

    /**
     * 获取消息
     * @param record
     * @return
     */
    @KafkaListener(topics = "kafka_topic1")
    public Object getMessage(ConsumerRecord<?,?> record) {
        System.out.println("Kafka Messave key:"+record.key());
        System.out.println("Kafka Messave value:"+record.value());
        return record;
    }
}
