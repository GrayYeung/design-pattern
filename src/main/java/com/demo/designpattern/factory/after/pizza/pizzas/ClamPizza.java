package com.demo.designpattern.factory.after.pizza.pizzas;

import com.demo.designpattern.factory.after.ingredients.PizzaIngredientFactory;

public class ClamPizza extends Pizza {

    /**
     * {@link CheesePizza#ingredientFactory}
     */
    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }

}
