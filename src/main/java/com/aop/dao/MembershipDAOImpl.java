package com.aop.dao;

import com.aop.entity.Membership;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MembershipDAOImpl implements MembershipDAO {

    private final List<Membership> membershipList = new ArrayList<>();

    @Override
    public List<Membership> getMembershipList() {
        return membershipList;
    }

    @Override
    public void saveMembership(Membership membership) {
        if (!this.membershipList.contains(membership))
            membershipList.add(membership);
    }

    @Override
    public Membership getMembership(int id) {
        return membershipList.stream().
                filter(m -> m.getId() == id).
                findAny().orElse(null);
    }

    @Override
    public void deleteMembership(Membership membership) {
        this.membershipList.remove(membership);
    }
}
