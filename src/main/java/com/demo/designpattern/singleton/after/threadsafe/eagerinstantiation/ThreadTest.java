package com.demo.designpattern.singleton.after.threadsafe.eagerinstantiation;

import lombok.Getter;

@Getter
public class ThreadTest extends Thread {

    private Singleton instanceResult;

    @Override
    public void run() {
        Singleton singleton = Singleton.getInstance();
        System.out.println("singleton = " + singleton + " by " + Thread.currentThread().getName()); // check memory address
        instanceResult = singleton;
    }

}
