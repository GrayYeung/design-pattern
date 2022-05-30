package com.demo.designpattern.factory.after.pizza.pizzas;

import com.demo.designpattern.factory.after.ingredients.PizzaIngredientFactory;

public class VeggiePizza extends Pizza {

    /**
     * {@link CheesePizza#ingredientFactory}
     */
    PizzaIngredientFactory ingredientFactory;

    public VeggiePizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
    }

}
