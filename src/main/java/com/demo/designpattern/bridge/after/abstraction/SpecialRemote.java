package com.demo.designpattern.bridge.after.abstraction;

import com.demo.designpattern.bridge.after.implementor.factory.TVFactory;

public class SpecialRemote extends RemoteControl {
    public SpecialRemote(TVFactory tvFactory) {
        super(tvFactory);
    }

    /* Decouple the changes in concreted abstraction from Implementor */

    public void up() {
        int channel = this.getChannel();
        this.setChannel(channel + 1);
    }

    public void down() {
        int channel = this.getChannel();
        this.setChannel(channel - 1);
    }
}