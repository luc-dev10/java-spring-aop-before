package com.aop.aspect;

import com.aop.entity.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Aspect
@Component
public class LoggingAspect {

    // Join Point
    @Before("execution(* com.aop.dao.*.*(..))")
    @Order(3)
    public void listenToParam(JoinPoint joinPoint) {

        // view arg
        Arrays.stream(joinPoint.getArgs())
              .forEach(arg -> {
                  if (arg instanceof Account)
                      System.out.println("This is an account.");
              });

        // view signature
        System.out.println(joinPoint.getSignature());

        System.out.println("Listening to you sir");
    }

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
