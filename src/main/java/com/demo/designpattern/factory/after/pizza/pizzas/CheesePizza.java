package com.demo.designpattern.factory.after.pizza.pizzas;

import com.demo.designpattern.factory.after.ingredients.PizzaIngredientFactory;

public class CheesePizza extends Pizza {

    /**
     * Regional variety comes from ingredientFactory.
     */
    PizzaIngredientFactory ingredientFactory;

    public CheesePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }

}
