package com.demo.designpattern.decorator.after;

// Decorator is of the same type as original object, to achieve interchangeable
public abstract class CondimentDecorator extends Beverage {

    /**
     * program to interface.
     * wrap Beverage by composition.
     */
    protected Beverage beverage;

    @Override
    public abstract String getDescription(); // change the getDescription()

    // inheritance to implement cost()

    /*
    // TODO: One possible change: introduce size
	public Size getSize() {
		return beverage.getSize();
	}
	*/

}
