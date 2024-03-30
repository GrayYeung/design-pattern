package com.demo.designpattern.visitor.after.model;

import com.demo.designpattern.visitor.after.Visitor;
import lombok.Getter;

@Getter
public class Bank extends Client {

    private final int branchesInsured;

    public Bank(String name, String address, String number, int branchesInsured) {
        super(name, address, number);
        this.branchesInsured = branchesInsured;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitBank(this); // redirect to visitorBank with reference of this Bank object
    }
}
