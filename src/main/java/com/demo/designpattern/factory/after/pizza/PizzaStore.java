package com.demo.designpattern.factory.after.pizza;

import com.demo.designpattern.factory.after.pizza.pizzas.Pizza;

public abstract class PizzaStore {

    /**
     * Subclass to care about the concrete implementation.
     */
    protected abstract Pizza createPizza(String item);

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
