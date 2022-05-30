package com.demo.designpattern.factory.after.ingredients;

import com.demo.designpattern.factory.after.ingredients.cheese.Cheese;
import com.demo.designpattern.factory.after.ingredients.clams.Clams;
import com.demo.designpattern.factory.after.ingredients.dough.Dough;
import com.demo.designpattern.factory.after.ingredients.pepperoni.Pepperoni;
import com.demo.designpattern.factory.after.ingredients.sauce.Sauce;
import com.demo.designpattern.factory.after.ingredients.veggies.Veggies;

/**
 * Abstract Factory to create a set of objects (ingredient). <br/>
 * Contain different Factory Methods to create object.
 */
public interface PizzaIngredientFactory {

    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggies[] createVeggies();

    Pepperoni createPepperoni();

    Clams createClam();

}
