package com.demo.designpattern.strategy.before.ducks;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class Duck {

    /**
     * All ducks quack and swim.
     * So the super class takes care of the implementation.
     */
    public void quack() {
        System.out.println("quack as Duck");
    }

    public void swim() {
        System.out.println("swim as Duck");
    }

    /* TODO:: Changes: want to add fly() to duck, but not every duck can fly */
    // public void fly() { // some code; } // this will force all subclass to override
    // abstract void fly(); // this will make the code duplication on all subclass

    /**
     * implemented by subclass.
     */
    abstract void display();

}
