package com.demo.designpattern.decorator.after.coffee;

import com.demo.designpattern.decorator.after.Beverage;

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return .99;
    }
}

