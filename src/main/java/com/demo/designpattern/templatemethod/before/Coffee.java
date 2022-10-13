package com.demo.designpattern.templatemethod.before;

/**
 * @see Tea
 */
public class Coffee {

    /**
     * A method to trigger from outside.
     */
    public void prepareRecipe() {
        boilWater();
        brewCoffeeGrinds();
        pourInCup();
        addSugarAndMilk();
    }

    // This step is in common
    public void boilWater() {
        System.out.println("Boiling water");
    }

    /**
     * @see Tea#steepTeaBag()
     */
    public void brewCoffeeGrinds() {
        System.out.println("Dripping Coffee through filter");
    }

    // This step is in common
    public void pourInCup() {
        System.out.println("Pouring into cup");
    }

    /**
     * @see Tea#addLemon()
     */
    public void addSugarAndMilk() {
        System.out.println("Adding Sugar and Milk");
    }

}
