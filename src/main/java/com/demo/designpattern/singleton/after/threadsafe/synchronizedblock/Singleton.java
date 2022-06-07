package com.demo.designpattern.singleton.after.threadsafe.synchronizedblock;

/**
 * Also called "double-checked locking"
 */
public class Singleton {

    // volatile field, guarantee the read after write
    private volatile static Singleton uniqueInstance;
    // other useful fields here

    private Singleton() {
    }

    public static Singleton getInstance() {
        // this is lazy instantiation
        if (uniqueInstance == null) {
            /*
             * synchronized block:
             * instead of block thread for the whole method, we block thread for a small code block only.
             *
             * Only 1 thread can enter this function at the same time due to synchronized
             *
             * Wrapped in if block so that the synchronized overhead will only happen once at the beginning
             */
            synchronized (Singleton.class) {
                // check again on each thread
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton(); // new value should be now seen to other thread due to volatile
                }
            }
        }

        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a statically initialized Singleton by \"double-checked locking\"!";
    }

}
