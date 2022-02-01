package com.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Pointcut("execution(* com.aop.dao.*.*(..))")
    @Order(1)
    public void cloudSave() {
    }

    @Pointcut("execution(* com.aop.dao.*.*(..))")
    @Order(2)
    public void logProcess() {
    }

    @Before("cloudSave()")
    private void daoCloudSave() {
        System.out.println("Cloud Saving");
    }

    @Before("logProcess()")
    private void daoLogProcess() {
        System.out.println("Log Process");
    }

    // @Pointcut("execution(* com.aop.dao.*.*(..))")
    // @Order(2)
    // private void forNextDaoPackage() {
    //
    // }
    //
    // @Pointcut("execution(* com.aop.dao.*.get*(..))")
    // @Order(2)
    // private void forDaoGetterPackage() {
    //
    // }
    //
    // @Pointcut("execution(* com.aop.dao.*.set*(..))")
    // private void forDaoSetterPackage() {
    //
    // }
    //
    // // add advice
    // @Before("forDaoPackage() && !(forDaoSetterPackage() || forDaoGetterPackage())")
    // public void addBeforeAccountAdvice() {
    //     System.out.println("Is Service running.");
    // }
    //
    // @Before("forDaoPackage() && !(forDaoSetterPackage() || forDaoGetterPackage())")
    // public void addBeforeAddingAccount() {
    //     System.out.println("Saving your account sir.");
    // }

}
