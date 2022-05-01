package com.demo.designpattern.decorator.after;

public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

    /*
    // TODO: One possible change: introduce size
    public enum Size {TALL, GRANDE, VENTI}

    protected Size size = Size.TALL; // define size

    public void setSize(Size size) {
        this.size = size;
    }

    public Size getSize() {
        return this.size;
    }
	*/

}
