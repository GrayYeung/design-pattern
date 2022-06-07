package com.demo.designpattern.singleton.before;

public class ChocolateController {
    public static void main(String... args) {

        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();

        // will return the existing instance
        ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
        System.out.println(boiler.equals(boiler2));
    }
}
