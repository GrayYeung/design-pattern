package com.demo.designpattern.iterator.before;

public class Waitress {

    DinerMenu dinerMenu;
    PancakeHouseMenu pancakeHouseMenu;

    public Waitress() {
        this.dinerMenu = new DinerMenu();
        this.pancakeHouseMenu = new PancakeHouseMenu();
    }

    public void printMenu() {
        printDinnerMenu();
        printPancakeHouseMenu();
    }

    private void printDinnerMenu() {
        var menu = dinerMenu.getMenuItems();
        // FIXME: don't want to know the detailed implementation
        for (int i = 0; i < menu.length; i++) {
            // print something
            System.out.print(menu[i].getName() + ", ");
            System.out.print(menu[i].getPrice() + " -- ");
            System.out.println(menu[i].getDescription());
        }
    }

    private void printPancakeHouseMenu() {
        var menu = pancakeHouseMenu.getMenuItems();
        // FIXME: don't want to know the detailed implementation
        for (int i = 0; i < menu.size(); i++) {
            // print something
            System.out.print(menu.get(i).getName() + ", ");
            System.out.print(menu.get(i).getPrice() + " -- ");
            System.out.println(menu.get(i).getDescription());
        }
    }

}
