package com.demo.designpattern.singleton.before;

import lombok.Getter;

@Getter
public class ThreadTest extends Thread {

    private ChocolateBoiler instanceResult;

    @Override
    public void run() {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        System.out.println("boiler = " + boiler + " by " + Thread.currentThread().getName()); // check memory address
        instanceResult = boiler;
    }

}
