package com.aop.service;

import com.aop.dao.MembershipDAO;
import com.aop.entity.Membership;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MembershipServiceImpl implements MembershipService {

    @Autowired
    private MembershipDAO membershipDAO;

    @Override
    public List<Membership> getMemberships() {
        return membershipDAO.getMembershipList();
    }

    @Override
    public void saveMembership(Membership membership) {
        membershipDAO.saveMembership(membership);
    }

    @Override
    public Membership getMembership(int id) {
        return membershipDAO.getMembership(id);
    }

    @Override
    public void deleteMembership(Membership membership) {
        membershipDAO.deleteMembership(membership);
    }

    @Override
    public boolean isServiceRunning() {
        return true;
    }
}
