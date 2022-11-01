package com.demo.designpattern.iterator.after;

import com.demo.designpattern.iterator.before.MenuItem;

import java.util.Iterator;

public class PancakeHouseMenu extends com.demo.designpattern.iterator.before.PancakeHouseMenu implements Menu {

    public Iterator<MenuItem> createIterator() {
        return this.getMenuItems().iterator(); // using Java's iterator
    }

    // other menu methods here
}
