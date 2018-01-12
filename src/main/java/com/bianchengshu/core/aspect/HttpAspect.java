package com.bianchengshu.core.aspect;

import com.bianchengshu.core.result.Result;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created by jiangxianzeng on 17/11/29.
 */

@Aspect
@Component
public class HttpAspect {

    @Pointcut("execution(public * com.bianchengshu.rest.controller.*.*(..))")
    public void log() {

    }

    @Before("log()")
    public void doBefore(JoinPoint joinPoint) {

        System.out.println("doBefore..........");
    }

    @Around("log()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Result result = null;
        System.out.println("doAround..........");
        try {

        } catch (Exception e) {
            //return handleException.exceptionGet(e);
        }

        if (result == null) {
            return proceedingJoinPoint.proceed();
        } else {
            return result;
        }
    }

    @AfterReturning(pointcut = "log()", returning = "object")
    public void doAfterReturning(Object object) {
        System.out.println(object.toString());
    }
}
