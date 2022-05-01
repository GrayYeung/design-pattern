package com.demo.designpattern.decorator.before.coffeeCombination;

import com.demo.designpattern.decorator.before.Beverage;

// FIXME: class explosion
public class HouseBlendWithSteamMilkAndMocha extends Beverage {
    public HouseBlendWithSteamMilkAndMocha() {
        description = "House Blend Coffee with StreamMilk and Mocha";
    }

    public double cost() {
        return 1.09;
    }
}

