package com.demo.designpattern.strategy.after.ducks;

import com.demo.designpattern.strategy.after.strategies.fly.FlyBehavior;
import com.demo.designpattern.strategy.after.strategies.quack.QuackBehavior;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter // To allow changing strategy at runtime
@Getter
public abstract class Duck {

    /* Favour composition over inheritance */
    protected FlyBehavior flyBehavior;
    protected QuackBehavior quackBehavior;

    public void performFly() {
        /* Program to interface, not implementations */
        flyBehavior.fly();
    }

    public void performQuack() {
        /* Program to interface, not implementations */
        quackBehavior.quack();
    }


    public void swim() {
        System.out.println("swim as Duck");
    }

    /**
     * implemented by subclass.
     */
    abstract void display();

}
