package com.demo.designpattern.decorator.after.condiment;

import com.demo.designpattern.decorator.after.Beverage;
import com.demo.designpattern.decorator.after.CondimentDecorator;

public class Milk extends CondimentDecorator {

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    /**
     * call wrapped beverage to chain description.
     */
    public String getDescription() {
        return beverage.getDescription() + ", Milk";
    }

    /**
     * call wrapped beverage to chain cost.
     */
    public double cost() {
        return .10 + beverage.cost();
    }
}
