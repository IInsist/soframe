package cn.com.soframe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

//排除自动配置数据源
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan({"cn.com.soframe.module.**.repository"})
public class SoFrameApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoFrameApplication.class, args);
	}

}
