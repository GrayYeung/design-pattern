package com.demo.designpattern.adapter.after.waya.client;

import com.demo.designpattern.adapter.after.waya.adaptee.Drone;
import com.demo.designpattern.adapter.after.waya.adaptee.SuperDrone;
import com.demo.designpattern.adapter.after.waya.adaptee.Turkey;
import com.demo.designpattern.adapter.after.waya.adaptee.WildTurkey;
import com.demo.designpattern.adapter.after.waya.adapter.DroneAdapter;
import com.demo.designpattern.adapter.after.waya.adapter.TurkeyAdapter;
import com.demo.designpattern.adapter.after.waya.target.Duck;
import com.demo.designpattern.adapter.after.waya.target.MallardDuck;

public class DuckTestDrive {

    public static void main(String[] args) {
        Duck duck = new MallardDuck();

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The Turkey says...");
        turkey.gobble();
        turkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

        // Challenge
        Drone drone = new SuperDrone();
        Duck droneAdapter = new DroneAdapter(drone);
        testDuck(droneAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

}
