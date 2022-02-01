package com.aop.service;

import com.aop.entity.Account;

import java.util.List;

public interface AccountService {

    public List<Account> getAccounts();

    public void saveAccount(Account account);

    public Account getAccount(int id);

    public void deleteAccount(Account account);

    public boolean isServiceRunning();

}
