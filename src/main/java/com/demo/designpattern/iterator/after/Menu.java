package com.demo.designpattern.iterator.after;

import java.util.Iterator;

public interface Menu {
    /**
     * To provide an Iterator rather extend.
     * Factor Pattern.
     */
    Iterator<?> createIterator();
}
