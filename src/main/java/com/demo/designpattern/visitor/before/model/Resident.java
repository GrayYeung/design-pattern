package com.demo.designpattern.visitor.before.model;

import lombok.Getter;

@Getter
public class Resident extends Client {

    private final String insuranceClass;

    public Resident(String name, String address, String number, String insuranceClass) {
        super(name, address, number);
        this.insuranceClass = insuranceClass;
    }

    @Override
    public void sendEmail() {
        System.out.println("Sending email about medical insurance");
    }
}