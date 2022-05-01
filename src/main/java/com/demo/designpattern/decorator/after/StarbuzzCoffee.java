package com.demo.designpattern.decorator.after;

import com.demo.designpattern.decorator.after.coffee.DarkRoast;
import com.demo.designpattern.decorator.after.coffee.Espresso;
import com.demo.designpattern.decorator.after.coffee.HouseBlend;
import com.demo.designpattern.decorator.after.condiment.Mocha;
import com.demo.designpattern.decorator.after.condiment.Soy;
import com.demo.designpattern.decorator.after.condiment.Whip;

public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3); // can wrap any number of decorator
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
