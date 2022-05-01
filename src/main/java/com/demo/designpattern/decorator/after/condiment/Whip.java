package com.demo.designpattern.decorator.after.condiment;

import com.demo.designpattern.decorator.after.Beverage;
import com.demo.designpattern.decorator.after.CondimentDecorator;

/**
 * note:
 *
 * @see Milk
 */
public class Whip extends CondimentDecorator {
    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}
