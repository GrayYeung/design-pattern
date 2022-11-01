package com.demo.designpattern.iterator.after;

import com.demo.designpattern.iterator.before.MenuItem;

import java.util.Iterator;
import java.util.List;


public class Waitress {

    List<Menu> menus;

    public Waitress(List<Menu> menus) {
        this.menus = menus;
    }

    public void printMenu() {
        Iterator<?> menuIterator = menus.iterator();

        // now, only need take care on iterator, don't have to know detailed implementation
        while (menuIterator.hasNext()) {
            Menu menu = (Menu) menuIterator.next();
            printMenu(menu.createIterator()); // each time will reset cursor
        }
    }

    void printMenu(Iterator<?> iterator) {
        while (iterator.hasNext()) {
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.print(menuItem.getName() + ", ");
            System.out.print(menuItem.getPrice() + " -- ");
            System.out.println(menuItem.getDescription());
        }
    }

}
