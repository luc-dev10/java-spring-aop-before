package com.aop.controller;

import com.aop.SpringConfiguration;
import com.aop.entity.Account;
import com.aop.entity.Membership;
import com.aop.service.AccountService;
import com.aop.service.MembershipService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppController {

    // simulates the controller class
    public static void main(String[] args) {

        // read configuration
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        AccountService accountService = context.getBean("accountService", AccountService.class);
        MembershipService membershipService = context.getBean("membershipService", MembershipService.class);

        // call business method
        Account account = new Account();
        account.setId(1);
        account.setFirstName("Lucio");
        account.setLastName("Zhao");
        account.setEmail("lucio.zhao@email.com");

        // save account
        accountService.saveAccount(account);

        // get account
        account = accountService.getAccount(1);

        // create membership
        Membership membership = new Membership();
        membership.setType(Membership.MEMBERSHIP_TYPE.FREE);
        // AOP
        System.out.println(membershipService.isServiceRunning());

        // print account

        // close
        context.close();

    }
}
