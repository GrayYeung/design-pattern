package com.demo.designpattern.singleton.after.threadsafe.eagerinstantiation;

public class Singleton {

    /* eager instantiation:
     * may cost extract resource if this instance is never used
     */
    private static final Singleton uniqueInstance = new Singleton();
    // other useful fields here

    private Singleton() {
    }

    public static Singleton getInstance() {
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a statically initialized Singleton!";
    }
}
