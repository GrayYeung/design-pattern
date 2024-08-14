package com.demo.designpattern.visitor.after.model;

import com.demo.designpattern.visitor.after.Visitor;
import lombok.Data;

/**
 * @see Bank
 */
@Data
public abstract class Client {
    private final String name;
    private final String address;
    private final String number;

    /**
     * Double Dispatch:
     * Let subclass to decide how to redirect the request to visitor.
     */
    public abstract void accept(Visitor visitor);
}
