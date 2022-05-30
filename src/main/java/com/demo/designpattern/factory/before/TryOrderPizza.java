package com.demo.designpattern.factory.before;

import com.demo.designpattern.factory.before.pizzas.Pizza;

public class TryOrderPizza {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();

        Pizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("pizza = " + pizza);
    }
}
