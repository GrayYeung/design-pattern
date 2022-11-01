package com.demo.designpattern.iterator.after;

import java.util.ArrayList;
import java.util.List;

public class MenuTestDrive {

    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        List<Menu> menus = new ArrayList<>();
        menus.add(dinerMenu);
        menus.add(pancakeHouseMenu);

        Waitress waitress = new Waitress(menus);

        waitress.printMenu();
    }

}
