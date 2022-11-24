package com.demo.designpattern.state.after.state;


import com.demo.designpattern.state.after.GumballMachine;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SoldState implements State {

    /**
     * Hold the reference of Context object.
     */
    private final GumballMachine gumballMachine;

    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!");
    }

    /**
     * state control logic in State object, since the transition is dynamic.
     */
    public void dispense() {
        gumballMachine.releaseBall();
        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getNoQuarterState());
        } else {
            System.out.println("Oops, out of gumballs!");
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }
    }

    public void refill() {
    }

    public String toString() {
        return "dispensing a gumball";
    }

}


