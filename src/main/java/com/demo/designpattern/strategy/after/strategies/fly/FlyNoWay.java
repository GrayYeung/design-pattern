package com.demo.designpattern.strategy.after.strategies.fly;

public class FlyNoWay implements FlyBehavior {

    public void fly() {
        System.out.println("I can't fly");
    }

}
