package com.demo.designpattern.command.before;

import com.demo.designpattern.command.common.vendor.Light;

public class RemoteControlTest {
    public static void main(String[] args) {

        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light("Bath Room");
        remote.setSlot(light);
        remote.buttonWasPressed();
    }

}
