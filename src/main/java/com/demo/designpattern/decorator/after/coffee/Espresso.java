package com.demo.designpattern.decorator.after.coffee;

import com.demo.designpattern.decorator.after.Beverage;

public class Espresso extends Beverage {

    public Espresso() {
        description = "Espresso";
    }

    public double cost() {
        return 1.99;
    }
}

