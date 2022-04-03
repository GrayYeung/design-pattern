package com.demo.designpattern.strategy.after.ducks;

import com.demo.designpattern.strategy.after.strategies.fly.FlyBehavior;
import com.demo.designpattern.strategy.after.strategies.fly.FlyWithWings;
import com.demo.designpattern.strategy.after.strategies.quack.Quack;
import com.demo.designpattern.strategy.after.strategies.quack.QuackBehavior;

public class RedheadDuck extends Duck {

    /* set default strategy for each type of duck by constructor */
    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    /* Set strategy by injection */
    public RedheadDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    @Override
    void display() {
        System.out.println("display as RedheadDuck");
    }

}
