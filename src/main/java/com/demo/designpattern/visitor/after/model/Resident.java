package com.demo.designpattern.visitor.after.model;

import com.demo.designpattern.visitor.after.Visitor;
import lombok.Getter;

@Getter
public class Resident extends Client {

    private final String insuranceClass;

    public Resident(String name, String address, String number, String insuranceClass) {
        super(name, address, number);
        this.insuranceClass = insuranceClass;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitResident(this);
    }
}
