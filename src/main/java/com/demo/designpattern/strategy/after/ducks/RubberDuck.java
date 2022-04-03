package com.demo.designpattern.strategy.after.ducks;

import com.demo.designpattern.strategy.after.strategies.fly.FlyBehavior;
import com.demo.designpattern.strategy.after.strategies.fly.FlyNoWay;
import com.demo.designpattern.strategy.after.strategies.quack.QuackBehavior;

/**
 * @see RedheadDuck see RedheadDuck for define strategy,
 */
public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        //quackBehavior = new Squeak();
        quackBehavior = () -> System.out.println("Squeak"); // set by lambda
    }

    public RubberDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void display() {
        System.out.println("display as RubberDuck");
    }

}
