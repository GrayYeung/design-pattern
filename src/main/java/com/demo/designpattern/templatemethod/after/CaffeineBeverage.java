package com.demo.designpattern.templatemethod.after;

public abstract class CaffeineBeverage {

    /**
     * Define a template method (outline of an algorithm).
     */
    public final void prepareRecipe() {
        boilWater();
        brew(); // extract common and tune a bit
        pourInCup();
        addCondiments(); // extract common and tune a bit
    }

    void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * Leave to subclass to handle detail.
     */
    abstract void brew();

    void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * Leave to subclass to handle detail.
     */
    abstract void addCondiments();


}
