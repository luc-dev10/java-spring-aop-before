package com.aop.dao;

import com.aop.entity.Membership;

import java.util.List;

public interface MembershipDAO {

    public List<Membership> getMembershipList();

    public void saveMembership(Membership membership);

    public Membership getMembership(int id);

    public void deleteMembership(Membership membership);

}
