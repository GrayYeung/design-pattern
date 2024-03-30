package com.demo.designpattern.visitor.before.model;

import lombok.Getter;

@Getter
public class Restaurant extends Client {

    public final boolean availableAboard;

    public Restaurant(String name, String address, String number, boolean availableAboard) {
        super(name, address, number);
        this.availableAboard = availableAboard;
    }

    @Override
    public void sendEmail() {
        System.out.println("Sending email about fire insurance");
    }
    
}
