package cn.com.soframe.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author fujh
 * @since 2020年9月1日09:55:50
 * 面向切面实现操作日志，记录
 */
// @Aspect 声明为切面类
// @Component 纳入IOC容器管辖
@Aspect
@Component
@Slf4j
public class OperationLogAspect {

    /**
     * 1、定义切点：在何处做
     * 2、定义通知：在何时做什么事
     *      2.1、前置通知
     *      2.2、后置通知
     *      2.3、返回通知
     *      2.4、异常通知
     *      2.5、环绕通知
     */

    /**
     * 1、定义切点：可定义某个注解，或某控制层方法
     *     此处将切点定义在 TReviewRecordController 控制层下所有方法中
     */
    @Pointcut("execution(public * cn.com.soframe.module.reviewRecord.controller.TReviewRecordController.*(..)))")
    public void logPoint(){}

    /**
     * 1、定义切点：
     *      此处定义注解被使用方法上
     */
    @Pointcut("@annotation(cn.com.soframe.annotation.OperationLog)")
    public void annotationLogPoint(){}


    /**
     * 2.1、前置通知
     */
    @Before(value = "logPoint()")
    public void doBefore(JoinPoint point){
        System.out.println(point.toString());
        System.out.println("前置通知！");
        System.out.println();
    }

    /**
     * 2.2、后置通知
     */
    @After(value = "logPoint()")
    public void doAfter(){

    }

}
