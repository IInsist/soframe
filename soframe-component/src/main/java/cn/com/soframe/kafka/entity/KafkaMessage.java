package cn.com.soframe.kafka.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Date;

/**
 * @author fujh
 * @since 2020年9月7日16:39:06
 * Kafka消息实体类
 */
@Data
@AllArgsConstructor
public class KafkaMessage {
    /**
     * id
     */
    private Long id;

    /**
     * 消息内容
     */
    private String msg;

    /**
     * 发送时间
     */
    private Date sendTime;

    public KafkaMessage(String message){
        this.id = System.currentTimeMillis();
        this.msg = message;
        this.sendTime = new Date();
    }
}
