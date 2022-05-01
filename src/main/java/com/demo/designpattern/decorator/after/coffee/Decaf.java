package com.demo.designpattern.decorator.after.coffee;

import com.demo.designpattern.decorator.after.Beverage;

public class Decaf extends Beverage {
    public Decaf() {
        description = "Decaf Coffee";
    }

    public double cost() {
        return 1.05;
    }
}

