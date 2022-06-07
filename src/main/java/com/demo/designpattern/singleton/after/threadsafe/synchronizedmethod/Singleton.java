package com.demo.designpattern.singleton.after.threadsafe.synchronizedmethod;

public class Singleton {

    private static Singleton uniqueInstance;
    // other useful fields here

    private Singleton() {
    }

    /*
     * synchronized method:
     * straightforward but will cost for performance, decrease byt a factor of 100.
     *
     * Do NOT use this approach when getInstance() is called frequently.
     */
    public static synchronized Singleton getInstance() {
        // this is lazy instantiation
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }

        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a thread safe Singleton by synchronized method!";
    }

}
