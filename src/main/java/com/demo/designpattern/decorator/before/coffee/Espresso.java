package com.demo.designpattern.decorator.before.coffee;

import com.demo.designpattern.decorator.before.Beverage;

public class Espresso extends Beverage {

	public Espresso() {
		description = "Espresso";
	}

	public double cost() {
		return 1.99;
	}
}

