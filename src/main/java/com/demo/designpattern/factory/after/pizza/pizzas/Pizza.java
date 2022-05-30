package com.demo.designpattern.factory.after.pizza.pizzas;

import com.demo.designpattern.factory.after.ingredients.cheese.Cheese;
import com.demo.designpattern.factory.after.ingredients.clams.Clams;
import com.demo.designpattern.factory.after.ingredients.dough.Dough;
import com.demo.designpattern.factory.after.ingredients.pepperoni.Pepperoni;
import com.demo.designpattern.factory.after.ingredients.sauce.Sauce;
import com.demo.designpattern.factory.after.ingredients.veggies.Veggies;
import lombok.*;

/**
 * Note that the factory is stored at subclass. {@link CheesePizza#ingredientFactory}
 */
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public abstract class Pizza {

    protected String name;

    protected Dough dough;
    protected Sauce sauce;
    protected Veggies[] veggies;
    protected Cheese cheese;
    protected Pepperoni pepperoni;
    protected Clams clam;

    /**
     * Subclass to care about the concrete implementation.
     * Each type of pizza can have its own implementation.
     */
    public abstract void prepare();

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
