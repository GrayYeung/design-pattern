package com.demo.designpattern.decorator.before.coffeeCombination;

import com.demo.designpattern.decorator.before.Beverage;

public class HouseBlendWithSteamMilk extends Beverage {
    public HouseBlendWithSteamMilk() {
        description = "House Blend Coffee with StreamMilk";
    }

    public double cost() {
        return .99;
    } // FIXME: hardcode cost as a whole of combination
}

