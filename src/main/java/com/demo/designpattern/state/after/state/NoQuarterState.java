package com.demo.designpattern.state.after.state;


import com.demo.designpattern.state.after.GumballMachine;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class NoQuarterState implements State {

    private final GumballMachine gumballMachine;

    public void insertQuarter() {
        System.out.println("You inserted a quarter");
        gumballMachine.setState(gumballMachine.getHasQuarterState());
    }

    public void ejectQuarter() {
        System.out.println("You haven't inserted a quarter");
    }

    public void turnCrank() {
        System.out.println("You turned, but there's no quarter");
    }

    public void dispense() {
        System.out.println("You need to pay first");
    }

    public void refill() {
    }

    public String toString() {
        return "waiting for quarter";
    }

}
