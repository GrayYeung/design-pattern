package com.demo.designpattern.composite.after;

import lombok.RequiredArgsConstructor;

/**
 * Leaf class.
 */
@RequiredArgsConstructor
public class MenuItem extends MenuComponent {

    private final String name;
    private final String description;
    private final boolean vegetarian;
    private final double price;

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }

    /**
     * different implement from leaf.
     *
     * @see Menu#print
     */
    public void print() {
        System.out.print("  " + getName());
        if (isVegetarian()) {
            System.out.print("(v)");
        }
        System.out.println(", " + getPrice());
        System.out.println("     -- " + getDescription());
    }
}
