package com.boba.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component("logging")
@Aspect //指定当前类为切面类
public class Logging {
    // 扫描代理对象
    @Pointcut("execution(* com.boba.service.impl.UserServiceImpl.*(..))")
    public void pointCut() {
    }

    // 前置通知 : 在执行目标方法之前执行
    @Before("Logging.pointCut()")
    public void before() {
        System.out.println("前置通知调用. ");
    }

    // 后置/最终通知：在执行目标方法之后执行  【无论是否出现异常最终都会执行】
    @After("Logging.pointCut()")
    public void after() {
        System.out.println("后置通知调用.");
    }

    // 环绕通知：环绕目标方式执行
    @Around("Logging.pointCut()")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知调用, 环绕前. ");
        pjp.proceed();
        System.out.println("环绕通知调用, 环绕后. ");
    }

    // 异常通知： 当目标方法执行异常时候执行此关注点代码
    @AfterThrowing("Logging.pointCut()")
    public void afterException() {
        System.out.println("异常拦截通知调用. ");
    }

    // 返回后通知： 在调用目标方法结束后执行 【出现异常不执行】
    @AfterReturning("Logging.pointCut()")
    public void afterReturning() {
        System.out.println("返回后通知, 但在报错后不会调用. ");
    }

}
