package com.demo.designpattern.visitor.before.model;

import lombok.Getter;

@Getter
public class Bank extends Client {

    private final int branchesInsured;

    public Bank(String name, String address, String number, int branchesInsured) {
        super(name, address, number);
        this.branchesInsured = branchesInsured;
    }

    // FIXME: POJO should keep its single responsibility
    @Override
    public void sendEmail() {
        System.out.println("Sending email about thief insurance");
    }

}
