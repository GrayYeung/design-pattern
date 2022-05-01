package com.demo.designpattern.decorator.after.condiment;

import com.demo.designpattern.decorator.after.Beverage;
import com.demo.designpattern.decorator.after.CondimentDecorator;

/**
 * note:
 *
 * @see Milk
 */
public class Mocha extends CondimentDecorator {
    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    public double cost() {
        return .20 + beverage.cost();
    }
}
