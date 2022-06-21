package com.demo.designpattern.command.common.vendor;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class TV {

    private final String location;
    private int channel;

    public void on() {
        System.out.println(location + " TV is on");
    }

    public void off() {
        System.out.println(location + " TV is off");
    }

    public void setInputChannel() {
        this.channel = 3;
        System.out.println(location + " TV channel is set for DVD");
    }
}
