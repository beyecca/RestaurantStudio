package com.company;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Currency;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        MenuItem pizzaMenuItem = new MenuItem(new Date(), false, 12.00f, "dinner pizza", "pizza", Category.Main);
        MenuItem cakeMenuItem = new MenuItem(new Date(), false, 4.00f, "delicious", "cake", Category.Dessert);
        MenuItem nachosMenuItem = new MenuItem(new Date(), false, 8.00f, "yum", "nachos", Category.Appetizer);

        ArrayList<MenuItem> menuItems = new ArrayList<>();
        menuItems.add(pizzaMenuItem);
        menuItems.add(cakeMenuItem);
        menuItems.add(nachosMenuItem);

        Menu aMenu = new Menu(menuItems);

        aMenu.printMenu();

        MenuItem brownieMenuItem = new MenuItem(new Date(), true, 5.00f, "tasty", "brownie", Category.Dessert);

        aMenu.addMenuItem(brownieMenuItem);

        System.out.println("----");

        aMenu.printMenu();

        aMenu.removeMenuItem(brownieMenuItem);

        System.out.println("----");

        aMenu.printMenu();

        aMenu.printMenuItem(brownieMenuItem);

        MenuItem copyOfBrownieMenuItem = new MenuItem(new Date(), true, 5.00f, "tasty", "brownie", Category.Dessert);

        System.out.println("----");

        Boolean menuItemsAreEqual = brownieMenuItem.equals(copyOfBrownieMenuItem);
        System.out.println("Brownies are equal: " + menuItemsAreEqual);

        Boolean menuItemsAreNotEqual = brownieMenuItem.equals(pizzaMenuItem);
        System.out.println("Items are not equal: " + menuItemsAreNotEqual);
    }
}
