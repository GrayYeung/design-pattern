package com.demo.designpattern.state.after.state;


import com.demo.designpattern.state.after.GumballMachine;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SoldOutState implements State {

    private final GumballMachine gumballMachine;

    public void insertQuarter() {
        System.out.println("You can't insert a quarter, the machine is sold out");
    }

    public void ejectQuarter() {
        System.out.println("You can't eject, you haven't inserted a quarter yet");
    }

    public void turnCrank() {
        System.out.println("You turned, but there are no gumballs");
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill() {
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    public String toString() {
        return "sold out";
    }

}
