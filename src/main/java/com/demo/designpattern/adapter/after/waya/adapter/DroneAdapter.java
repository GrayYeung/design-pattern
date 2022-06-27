package com.demo.designpattern.adapter.after.waya.adapter;

import com.demo.designpattern.adapter.after.waya.adaptee.Drone;
import com.demo.designpattern.adapter.after.waya.target.Duck;

/**
 * No additional responsibility added.
 */
public class DroneAdapter implements Duck {
    Drone drone;

    public DroneAdapter(Drone drone) {
        this.drone = drone;
    }

    public void quack() {
        drone.beep();
    }

    public void fly() {
        drone.spin_rotors();
        drone.take_off();
    }
}
