package com.demo.designpattern.adapter.after.waya.adaptee;

public class SuperDrone implements Drone {

    public void beep() {
        System.out.println("Beep beep beep");
    }

    public void spin_rotors() {
        System.out.println("Rotors are spinning");
    }

    public void take_off() {
        System.out.println("Taking off");
    }

}
