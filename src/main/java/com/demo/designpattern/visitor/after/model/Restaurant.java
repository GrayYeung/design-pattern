package com.demo.designpattern.visitor.after.model;

import com.demo.designpattern.visitor.after.Visitor;
import lombok.Getter;

@Getter
public class Restaurant extends Client {

    public final boolean availableAboard;

    public Restaurant(String name, String address, String number, boolean availableAboard) {
        super(name, address, number);
        this.availableAboard = availableAboard;
    }


    @Override
    public void accept(Visitor visitor) {
        visitor.visitRestaurant(this);
    }
}
