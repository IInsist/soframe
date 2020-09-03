package cn.com.soframe;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

//排除自动配置数据源
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan({"cn.com.soframe.module.**.repository"})
//SpringAOP依赖引用成功后，该注解默认开启
@EnableAspectJAutoProxy
//配置启动电Spring自带的任务调度
@EnableScheduling
public class SoFrameApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoFrameApplication.class, args);
		//SpringApplication springApplication = new SpringApplication(SoFrameApplication.class);
		//设置banner打印在控制台
		//springApplication.setBannerMode(Banner.Mode.CONSOLE);
		//springApplication.run(args);
	}

}
