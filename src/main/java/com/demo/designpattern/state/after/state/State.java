package com.demo.designpattern.state.after.state;

/**
 * Delegate the conditional code to different state objects.
 */
public interface State {

    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();

    void refill();

}
