package cn.com.soframe.kafka.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * @author fujh
 * @since 2020年9月8日11:41:26
 * Kafka消费者主题参数类
 */
@Component
// 自定义KafkaTopicProperties实体类去装载kafka.topic配置信息的内容
@ConfigurationProperties("kafka.topic")
@Data
public class KafkaTopicProperties implements Serializable {

    /**
     * 消费者组织ID
     */
    private String groupId;

    /**
     * 消费者主题（每个消费者都有对应的主题）
     */
    private String[] topicName;

}
