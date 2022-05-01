package com.demo.designpattern.decorator.after.condiment;

import com.demo.designpattern.decorator.after.Beverage;
import com.demo.designpattern.decorator.after.CondimentDecorator;

/**
 * note:
 *
 * @see Milk
 */
public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}
