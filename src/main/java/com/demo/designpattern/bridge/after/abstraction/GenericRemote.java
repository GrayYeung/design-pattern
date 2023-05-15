package com.demo.designpattern.bridge.after.abstraction;

import com.demo.designpattern.bridge.after.implementor.factory.TVFactory;

public class GenericRemote extends RemoteControl {
    public GenericRemote(TVFactory tvFactory) {
        super(tvFactory);
    }

    /* Decouple the changes in concreted abstraction from Implementor */

    public void nextChannel() {
        int channel = this.getChannel();
        this.setChannel(channel + 1);
    }

    public void prevChannel() {
        int channel = this.getChannel();
        this.setChannel(channel - 1);
    }
}