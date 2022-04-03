package com.demo.designpattern.observer.after.subject;

import com.demo.designpattern.observer.after.observer.CustomObserver;

/**
 * Subject that being observed.
 */
public interface Subject {

    void registerObserver(CustomObserver o);

    void removeObserver(CustomObserver o);

    /**
     * To notify all observers that there is a state changed at Subject.
     */
    void notifyObservers();

}
