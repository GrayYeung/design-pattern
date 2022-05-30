package com.demo.designpattern.factory.after.ingredients;

import com.demo.designpattern.factory.after.ingredients.cheese.Cheese;
import com.demo.designpattern.factory.after.ingredients.cheese.MozzarellaCheese;
import com.demo.designpattern.factory.after.ingredients.clams.Clams;
import com.demo.designpattern.factory.after.ingredients.clams.FrozenClams;
import com.demo.designpattern.factory.after.ingredients.dough.Dough;
import com.demo.designpattern.factory.after.ingredients.dough.ThickCrustDough;
import com.demo.designpattern.factory.after.ingredients.pepperoni.Pepperoni;
import com.demo.designpattern.factory.after.ingredients.pepperoni.SlicedPepperoni;
import com.demo.designpattern.factory.after.ingredients.sauce.PlumTomatoSauce;
import com.demo.designpattern.factory.after.ingredients.sauce.Sauce;
import com.demo.designpattern.factory.after.ingredients.veggies.BlackOlives;
import com.demo.designpattern.factory.after.ingredients.veggies.Eggplant;
import com.demo.designpattern.factory.after.ingredients.veggies.Spinach;
import com.demo.designpattern.factory.after.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory
		implements PizzaIngredientFactory {

	public Dough createDough() {
		return new ThickCrustDough();
	}

	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}

	public Cheese createCheese() {
		return new MozzarellaCheese();
	}

	public Veggies[] createVeggies() {
		Veggies veggies[] = {new BlackOlives(),
				new Spinach(),
				new Eggplant()};
		return veggies;
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clams createClam() {
		return new FrozenClams();
	}
}
