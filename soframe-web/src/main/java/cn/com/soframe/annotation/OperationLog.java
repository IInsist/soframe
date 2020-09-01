package cn.com.soframe.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * @author fujh
 * @since 2020年9月1日11:49:15
 * 自定义日志管理注解
 *
 * 注解解释：
 *  1、@Target 定义说明 “自定义注解类” 作用于什么地方
 *  2、
 */
@Target(ElementType.ANNOTATION_TYPE)
public @interface OperationLog {

}
