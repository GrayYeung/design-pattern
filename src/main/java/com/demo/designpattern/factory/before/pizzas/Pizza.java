package com.demo.designpattern.factory.before.pizzas;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public abstract class Pizza {

    private final String name;

    protected Pizza(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Preparing for " + name);
    }

    public void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

}
