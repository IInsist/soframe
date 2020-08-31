package cn.com.soframe.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author fujh
 * @date 2020年8月24日14:47:39
 * SpringFoxSwagger2的配置
 */
@Configuration
@EnableSwagger2
public class SpringFoxSwagger2Config {

    /**
     * 读取自定义配置中 springfox-swagger2-enable 的值：是否启用swagger
     */
    @Value("${my-config.springfox-swagger2-enable}")
    private String isEnable;

    /**
     * 配置springfox的核心Bean
     * @return springfox.documentation.spring.web.plugins.Docket
     */
    @Bean
    public Docket docket(){
        boolean enable = false;
        if(!StringUtils.isEmpty(isEnable) && isEnable.toLowerCase().equals("true")){
            enable = true;
        }
                //配置接口文档版本
        return new Docket(DocumentationType.SWAGGER_2)
                //配置是否启用
                .enable(enable)
                //配置应用基本信息
                .apiInfo(apiInfo())
                .groupName("SoFrame Team")
                //配置哪些接口提供Swagger展示
                .select()
                //配置扫描所有带有 ApiOperation.class 的注解方法
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                //配置扫描所有路径
                .paths(PathSelectors.any())
                //构建该Bean
                .build();
    }

    /**
     * 配置接口基本信息
     * @return springfox.documentation.service.ApiInfo
     */
    public ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                //设置swagger标题
                .title("SoFrame架构")
                //设置应用版本
                .version("v1.0")
                //设置应用描述
                .description("SoFrame架构：基于SpringMVC、Spring、Mybatis-plus等集成开发的SpringBoot框架，团队1人。")
                .contact(new Contact("fujh","","fujhsine@qq.com"))
                .build();
    }

}
