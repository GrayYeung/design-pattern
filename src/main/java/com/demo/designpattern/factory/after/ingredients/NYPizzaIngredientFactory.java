package com.demo.designpattern.factory.after.ingredients;

import com.demo.designpattern.factory.after.ingredients.cheese.Cheese;
import com.demo.designpattern.factory.after.ingredients.cheese.ReggianoCheese;
import com.demo.designpattern.factory.after.ingredients.clams.Clams;
import com.demo.designpattern.factory.after.ingredients.clams.FreshClams;
import com.demo.designpattern.factory.after.ingredients.dough.Dough;
import com.demo.designpattern.factory.after.ingredients.dough.ThinCrustDough;
import com.demo.designpattern.factory.after.ingredients.pepperoni.Pepperoni;
import com.demo.designpattern.factory.after.ingredients.pepperoni.SlicedPepperoni;
import com.demo.designpattern.factory.after.ingredients.sauce.MarinaraSauce;
import com.demo.designpattern.factory.after.ingredients.sauce.Sauce;
import com.demo.designpattern.factory.after.ingredients.veggies.*;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce();
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = {new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FreshClams();
	}
}
