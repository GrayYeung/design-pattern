package com.demo.designpattern.adapter.after.wayb.adapter;

import com.demo.designpattern.adapter.after.wayb.adaptee.Duck;
import com.demo.designpattern.adapter.after.wayb.target.Turkey;

import java.util.Random;

/**
 * No additional responsibility added.
 */
public class DuckAdapter implements Turkey {

    private final Duck duck;
    private final Random rand;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
        rand = new Random();
    }

    public void gobble() {
        duck.quack();
    }

    public void fly() {
        if (rand.nextInt(5) == 0) {
            duck.fly();
        }
    }
}
