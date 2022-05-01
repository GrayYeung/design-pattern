package com.demo.designpattern.decorator.before.coffee;

import com.demo.designpattern.decorator.before.Beverage;

public class Decaf extends Beverage {
	public Decaf() {
		description = "Decaf Coffee";
	}

	public double cost() {
		return 1.05;
	}
}

