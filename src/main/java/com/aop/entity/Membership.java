package com.aop.entity;

public class Membership {

    private int id;
    private MEMBERSHIP_TYPE type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public MEMBERSHIP_TYPE getType() {
        return type;
    }

    public void setType(MEMBERSHIP_TYPE type) {
        this.type = type;
    }

    public static enum MEMBERSHIP_TYPE {
        FREE, PREMIUM
    }

}
