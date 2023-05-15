package com.demo.designpattern.bridge.after;

import com.demo.designpattern.bridge.after.abstraction.GenericRemote;
import com.demo.designpattern.bridge.after.abstraction.SpecialRemote;
import com.demo.designpattern.bridge.after.implementor.factory.TVFactory;

public class Client {
    public static void main(String[] args) {
        TVFactory tvFactory = new TVFactory();
        SpecialRemote remoteSony = new SpecialRemote(tvFactory);
        System.out.println("Connect your remote to the TV");
        remoteSony.setTV("Sony");
        remoteSony.on();
        remoteSony.up();
        remoteSony.down();
        remoteSony.off();

        GenericRemote remoteLG = new GenericRemote(tvFactory);
        System.out.println("Connect your remote to the TV");
        remoteLG.setTV("LG");
        remoteLG.on();
        remoteLG.nextChannel();
        remoteLG.prevChannel();
        remoteLG.off();
    }
}