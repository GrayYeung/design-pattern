package com.demo.designpattern.composite.after;

/**
 * Component class.
 * Client can care the method of this class, but not that of composite class nor leaf class.
 */
public abstract class MenuComponent {

    /**
     * For composite.
     */
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * For composite.
     */
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    /**
     * For composite.
     */
    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException();
    }

    /**
     * For composite and leaf.
     */
    public String getName() {
        throw new UnsupportedOperationException();
    }

    /**
     * For composite and leaf.
     */
    public String getDescription() {
        throw new UnsupportedOperationException();
    }

    /**
     * For composite and leaf.
     */
    public double getPrice() {
        throw new UnsupportedOperationException();
    }

    /**
     * For leaf.
     */
    public boolean isVegetarian() {
        throw new UnsupportedOperationException();
    }

    /**
     * For leaf.
     */
    public void print() {
        throw new UnsupportedOperationException();
    }

}
