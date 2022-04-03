package com.demo.designpattern.strategy.after;

import com.demo.designpattern.strategy.after.ducks.RubberDuck;
import com.demo.designpattern.strategy.after.strategies.fly.FlyBehavior;
import com.demo.designpattern.strategy.after.strategies.fly.FlyRocketPowered;
import com.demo.designpattern.strategy.after.ducks.Duck;
import com.demo.designpattern.strategy.after.ducks.MallardDuck;
import com.demo.designpattern.strategy.after.strategies.quack.QuackBehavior;

public class MainApplication {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        mallard.performQuack();
        mallard.performFly();

        FlyBehavior cantFly = () -> System.out.println("I can't fly");
        QuackBehavior squeak = () -> System.out.println("Squeak");
        RubberDuck rubberDuck = new RubberDuck(cantFly, squeak);
        rubberDuck.performQuack();
        rubberDuck.performFly();

        Duck anotherRubberDuck = new RubberDuck();
        anotherRubberDuck.performFly();
        anotherRubberDuck.setFlyBehavior(new FlyRocketPowered()); // reset strategy
        anotherRubberDuck.performFly();
    }

}
