package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems;
    private Date lastUpdated;

    public Menu(ArrayList<MenuItem> menuItems) {
        this.menuItems = menuItems;
        setLastUpdated();
    }

    public void printMenu(){
        // iterate over all menuItems & print each one!
        for(MenuItem anItem: this.menuItems){
            anItem.printMenuItem();
        }

        System.out.println("Menu was last updated: "+this.lastUpdated);
    }

    public void printMenuItem(MenuItem anItem){
        System.out.println(anItem.getName() + ": " + anItem.getPrice() +" - "+anItem.getNewStatus());
    }

    public void addMenuItem(MenuItem item){
        item.setNew(true);
        setLastUpdated();
        this.menuItems.add(item);
    }

    public void removeMenuItem(MenuItem menuItem){
        if(menuItems.contains(menuItem)){
           this.menuItems.remove(menuItem);
            setLastUpdated();
        }
    }

    public void setLastUpdated() {
        this.lastUpdated = new Date();
    }
}

