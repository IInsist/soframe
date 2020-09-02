package cn.com.soframe.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
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
     * 1、定义切点1：可定义某个注解，或某控制层方法
     *     此处将切点定义在 TReviewRecordController 控制层下所有方法中
     */
    @Pointcut("execution(public * cn.com.soframe.module.reviewRecord.controller.TReviewRecordController.*(..)))")
    public void logPoint(){}

    /**
     * 1、定义切点2：
     *      此处将切点定义在 OperationLog 注解被使用方法上
     */
    @Pointcut("@annotation(cn.com.soframe.annotation.OperationLog)")
    public void annotationLogPoint(){}

    /**
     * 2.1、前置通知
     * @param point
     */
    @Before(value = "logPoint()")
    public void doBefore(JoinPoint point){
        System.out.println(point.toString());
        System.out.println("前置通知！");
        System.out.println();
    }

    /**
     * 2.2、后置通知
     * @param point
     */
    @After(value = "logPoint()")
    public void doAfter(JoinPoint point){
        System.out.println("后置通知！");
        System.out.println();
    }

    /**
     * 2.3、返回通知
     * @param point
     * @param returnParam 返回参数名
     */
    @AfterReturning(value = "annotationLogPoint()", returning = "returnParam")
    public void doReturn(JoinPoint point,Object returnParam){

        System.out.println("返回通知！");
        System.out.println();
    }

    /**
     * 2.4、异常通知
     * @param point
     * @param e 返回异常
     */
    @AfterThrowing(value = "logPoint()", throwing = "e")
    public void doException(JoinPoint point,Exception e){
        e.printStackTrace();
        System.out.println("异常通知！");
        System.out.println();
    }

    /**
     * 2.5、环绕通知
     * @param point
     */
//    @Around(value = "logPoint()")
//    public void doAround(JoinPoint point){
//        System.out.println("环绕通知！");
//        System.out.println();
//    }

}
