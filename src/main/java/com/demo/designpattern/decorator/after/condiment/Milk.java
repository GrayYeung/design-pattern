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

    /*
    // TODO: One possible change: introduce size
    public double cost() {
        double cost = beverage.cost();
        if (beverage.getSize() == Size.TALL) {
            cost += .10;
        } else if (beverage.getSize() == Size.GRANDE) {
            cost += .15;
        } else if (beverage.getSize() == Size.VENTI) {
            cost += .20;
        }
        return cost;
    }
    */
}
