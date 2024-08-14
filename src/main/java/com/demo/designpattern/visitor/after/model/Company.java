package com.demo.designpattern.visitor.after.model;

import com.demo.designpattern.visitor.after.Visitor;
import lombok.Getter;

@Getter
public class Company extends Client {

    private final int numberOfEmployees;

    public Company(String name, String address, String number, int numberOfEmployees) {
        super(name, address, number);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}
