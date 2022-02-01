package com.aop.service;

import com.aop.entity.Membership;

import java.util.List;

public interface MembershipService {
    public List<Membership> getMemberships();

    public void saveMembership(Membership membership);

    public Membership getMembership(int id);

    public void deleteMembership(Membership membership);

    public boolean isServiceRunning();
}
