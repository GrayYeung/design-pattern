package com.demo.designpattern.state.after.state;


import com.demo.designpattern.state.after.GumballMachine;
import lombok.RequiredArgsConstructor;

import java.util.Random;

@RequiredArgsConstructor
public class HasQuarterState implements State {

    private final GumballMachine gumballMachine;
    private final Random randomWinner = new Random(System.currentTimeMillis());

    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    /* original logic:
     *    public void turnCrank() {
     *        System.out.println("You turned...");
     *        gumballMachine.setState(gumballMachine.getSoldState());
     *    }
     */

    // with new transition logic together with new state;
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if ((winner == 0) && (gumballMachine.getCount() > 1)) {
            gumballMachine.setState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setState(gumballMachine.getSoldState());
        }
    }

    public void dispense() {
        System.out.println("No gumball dispensed");
    }

    public void refill() {
    }

    public String toString() {
        return "waiting for turn of crank";
    }

}
