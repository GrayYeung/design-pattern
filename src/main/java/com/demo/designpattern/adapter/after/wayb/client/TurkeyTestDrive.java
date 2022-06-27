package com.demo.designpattern.adapter.after.wayb.client;


import com.demo.designpattern.adapter.after.wayb.adaptee.MallardDuck;
import com.demo.designpattern.adapter.after.wayb.adapter.DuckAdapter;
import com.demo.designpattern.adapter.after.wayb.target.Turkey;

public class TurkeyTestDrive {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        for (int i = 0; i < 10; i++) {
            System.out.println("The DuckAdapter says...");
            duckAdapter.gobble();
            duckAdapter.fly();
        }
    }
}
