package com.demo.designpattern.decorator.after.coffee;

import com.demo.designpattern.decorator.after.Beverage;

public class HouseBlend extends Beverage {
    public HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
}

