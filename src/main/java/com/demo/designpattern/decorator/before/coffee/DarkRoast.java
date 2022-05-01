package com.demo.designpattern.decorator.before.coffee;

import com.demo.designpattern.decorator.before.Beverage;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		description = "Dark Roast Coffee";
	}

	public double cost() {
		return .99;
	}
}

