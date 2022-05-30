package com.demo.designpattern.factory.before;

import com.demo.designpattern.factory.before.pizzas.*;

public class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    private Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        }
        // TODO: change of implementation of object, e.g.: remove
        // if (type.equals("greek")) {
        //     return new GreeKPizza();
        // }
        if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        }

        /*
         * TODO: change of implementation of object,
         *   e.g.: adding new type of Pizza, have to update the code inside this PizzaStore
         */
        if (type.equals("clam")) {
            return new ClamPizza();
        }
        if (type.equals("veggie")) {
            return new VeggiePizza();
        }

        throw new IllegalArgumentException("Unknown type");
    }

}
