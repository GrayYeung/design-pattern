package com.demo.designpattern.iterator.after;

import com.demo.designpattern.iterator.before.MenuItem;

import java.util.Iterator;

public class DinerMenu extends com.demo.designpattern.iterator.before.DinerMenu implements Menu {

    public Iterator<MenuItem> createIterator() {
        // passing the iterable into iterator
        return new DinerMenuIterator(this.getMenuItems());
    }

    // other menu methods here

}
