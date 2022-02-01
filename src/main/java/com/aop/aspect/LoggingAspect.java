package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    // add advice
    @Before("execution(public boolean com.aop.service.MembershipService.isServiceRunning())")
    public void addBeforeAccountAdvice() {
        System.out.println("Is Service running.");
    }

}
