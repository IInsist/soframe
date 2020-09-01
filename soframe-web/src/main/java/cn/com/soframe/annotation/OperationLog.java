package cn.com.soframe.annotation;

import cn.com.soframe.common.constant.SoFrameBusinessConstant;

import java.lang.annotation.*;

/**
 * @author fujh
 * @since 2020年9月1日11:49:15
 * 自定义日志管理注解
 *
 * 注解解释：
 *  1、@Target 定义说明 “自定义注解类” 作用于什么地方
 *  2、@Retention 申明该 “自定义注解类” 作用域于什么时候
 *  3、@Documented 申明该注解包含于JavaDoc中
 *  4、@Inherited 申明该注解允许被子类继承它的注解
 */
@Target({ElementType.PARAMETER, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
public @interface OperationLog {

    /**
     * 定义：
     *  操作记录定义：操作内容、操作类型、模块名称、模块ID
     */

    /**
     * 操作内容，主要阐述该次操作，是操作了些什么内容
     *  例如：修改账号密码、更换头像
     * @return
     */
    String content() default "";

    /**
     * 操作类型:：默认 OTHER
     * @return
     */
    String operationType() default SoFrameBusinessConstant.OPERATION_TYPE_OTHER;

    /**
     * 操作模块名称
     * @return
     */
    String modelName() default "defalut";

    /**
     * 操作模块的ID（每个模块都有对应的ID）
     * @return
     */
    String modelId() default "1";

}
