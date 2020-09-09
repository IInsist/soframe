package cn.com.soframe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * @author fujh
 * so-frame框架组件包启动类
 */
//排除自动配置数据源
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SoFrameComponentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SoFrameComponentApplication.class, args);
    }

}
