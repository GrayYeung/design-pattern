package com.demo.designpattern.bridge.after.implementor;

/**
 * Implementor in Bridge pattern.
 * This provides implementation on low-level work.
 */
public abstract class TV {
    public abstract void on();

    public abstract void off();

    public abstract void tuneChannel(int channel);

    public abstract int getChannel();
}
