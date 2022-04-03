package com.demo.designpattern.strategy.after.ducks;

import com.demo.designpattern.strategy.after.strategies.fly.FlyWithWings;
import com.demo.designpattern.strategy.after.strategies.quack.Quack;

public class MallardDuck extends Duck {

    public MallardDuck() {
        this.quackBehavior = new Quack();
        this.flyBehavior = new FlyWithWings();
    }

    public void display() {
        System.out.println("display as MallardDuck");
    }
}
