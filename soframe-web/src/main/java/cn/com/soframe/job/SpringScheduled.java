package cn.com.soframe.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author fujh
 * @since 2020年9月3日15:05:20
 * 使用Spring自带的任务调度方法
 *  1、使用时需要在启动类上添加 @EnableScheduling 配置启动“任务调度”
 *  2、使用@Scheduled创建任务
 */
@Component
public class SpringScheduled {

    /**
     * 使用@Scheduled注解创建调度任务
     */
    @Scheduled(cron = "1/5 * * * * ?")
    public void schedule(){
        System.out.println("使用@Scheduled创建任务调度。。。。。");
    }

}
