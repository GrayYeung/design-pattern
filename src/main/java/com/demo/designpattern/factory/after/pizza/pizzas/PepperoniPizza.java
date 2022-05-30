package com.demo.designpattern.factory.after.pizza.pizzas;

import com.demo.designpattern.factory.after.ingredients.PizzaIngredientFactory;

public class PepperoniPizza extends Pizza {

    /**
     * {@link CheesePizza#ingredientFactory}
     */
    PizzaIngredientFactory ingredientFactory;

    public PepperoniPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    public void prepare() {
        System.out.println("Preparing " + name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        veggies = ingredientFactory.createVeggies();
        pepperoni = ingredientFactory.createPepperoni();
    }

}
