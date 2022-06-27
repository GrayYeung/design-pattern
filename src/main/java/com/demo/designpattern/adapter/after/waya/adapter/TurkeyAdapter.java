package com.demo.designpattern.adapter.after.waya.adapter;

import com.demo.designpattern.adapter.after.waya.adaptee.Turkey;
import com.demo.designpattern.adapter.after.waya.target.Duck;
import lombok.RequiredArgsConstructor;

/**
 * No additional responsibility added.
 */
@RequiredArgsConstructor
public class TurkeyAdapter implements Duck {

    private final Turkey turkey;

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey.fly();
        }
    }

}
