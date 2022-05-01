package com.demo.designpattern.decorator.before;

import com.demo.designpattern.decorator.before.coffee.Espresso;
import com.demo.designpattern.decorator.before.coffeeCombination.HouseBlendWithSteamMilk;
import com.demo.designpattern.decorator.before.coffeeCombination.HouseBlendWithSteamMilkAndMocha;

public class StarbuzzCoffee {

    public static void main(String args[]) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlendWithSteamMilk(); // FIXME: hardcode pattern of combination of coffee and condiment
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlendWithSteamMilkAndMocha();
        System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
