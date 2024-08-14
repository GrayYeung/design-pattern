package com.demo.designpattern.bridge.after.abstraction;

import com.demo.designpattern.bridge.after.implementor.TV;
import com.demo.designpattern.bridge.after.implementor.factory.TVFactory;

/**
 * Can also use to solve Class explosion on Cartesian Product.
 * This abstraction provides high-level control logic.
 */
public abstract class RemoteControl {
    /**
     * The bridge
     */
    TV tv;
    TVFactory tvFactory;

    public RemoteControl(TVFactory tvFactory) {
        this.tvFactory = tvFactory;
    }

    public void on() {
        this.tv.on();
    }

    public void off() {
        this.tv.off();
    }

    public void setChannel(int channel) {
        tv.tuneChannel(channel);
    }

    public int getChannel() {
        return tv.getChannel();
    }

    public void setTV(String type) {
        try {
            tv = tvFactory.getTV(type);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
