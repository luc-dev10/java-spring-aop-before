package com.aop;

import com.aop.service.AccountService;
import com.aop.service.AccountServiceImpl;
import com.aop.service.MembershipService;
import com.aop.service.MembershipServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@ComponentScan("com.aop")
@Configuration
@EnableAspectJAutoProxy
public class SpringConfiguration {

    @Bean
    public AccountService accountService() {
        return new AccountServiceImpl();
    }

    @Bean
    public MembershipService membershipService() {
        return new MembershipServiceImpl();
    }

}
