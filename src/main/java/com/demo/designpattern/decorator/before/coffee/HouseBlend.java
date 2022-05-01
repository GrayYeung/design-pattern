package com.demo.designpattern.decorator.before.coffee;

import com.demo.designpattern.decorator.before.Beverage;

public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	public double cost() {
		return .89;
	}
}

