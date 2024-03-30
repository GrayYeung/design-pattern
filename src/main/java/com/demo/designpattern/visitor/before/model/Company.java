package com.demo.designpattern.visitor.before.model;

import lombok.Getter;

@Getter
public class Company extends Client {

    private final int numberOfEmployees;

    public Company(String name, String address, String number, int numberOfEmployees) {
        super(name, address, number);
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public void sendEmail() {
        System.out.println("Sending email about employees insurance");
    }
}
