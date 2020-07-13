package com.hxw.hw1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
@Aspect
public class LogAspect {

    //公共切入点
    @Pointcut("execution(public float com.hxw.hw1.aop.CountImpl.*(float,float))")
    public void declarePointcut(){}

    //这里注释掉的通知都测试成功
    /*//前置通知
    @Before("declarePointcut()")
    public void beforeAdvice(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        List<Object> args = Arrays.asList(jp.getArgs());
        System.out.println("日志追踪：the method "+methodName+" begin with "+args);
    }

    //返回通知
    @AfterReturning(pointcut = "declarePointcut()",returning = "result")
    public void AfterReturningAdvice(JoinPoint jp,Object result) throws Throwable{
        String methodName = jp.getSignature().getName();
        System.out.println("日志追踪：the method "+methodName+" end with "+result);
    }

    //异常通知
    @AfterThrowing(pointcut = "declarePointcut()",throwing = "ex")
    public void AfterThrowingAdvice(JoinPoint jp,Exception ex){
        String methodName = jp.getSignature().getName();
        System.out.println("日志追踪：the method "+methodName+" occur exception:"+ex);
    }

    //后置通知
    @After("declarePointcut()")
    public  void AfterAdvice(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        System.out.println("日志追踪：the method "+methodName+" end ");
    }*/

    //环绕通知
    @Around("declarePointcut()")
    public Object ArroundAdvice(ProceedingJoinPoint pjp){
        String methodName = pjp.getSignature().getName();
        List<Object> args = Arrays.asList(pjp.getArgs());
        Object result = null;
        try{
            System.out.println("日志追踪：the method "+methodName+" begin with "+args);
            result = pjp.proceed();
            System.out.println("日志追踪：the method "+methodName+" end with "+result);
        } catch (Throwable throwable) {
            System.out.println("日志追踪：the method "+methodName+" occurs exception:"+throwable.getMessage());
            throwable.printStackTrace();
        }
        System.out.println("日志追踪：the method "+methodName+" end ");
        return result;
    }

}
