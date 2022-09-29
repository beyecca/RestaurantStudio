package com.company;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private Date dateAdded;
    private Boolean isNew;
    private float price;
    private String description;
    private String name;
    private Category category;

    public MenuItem(Date dateAdded, Boolean isNew, float price, String description, String name, Category category) {
        this.dateAdded = dateAdded;
        this.isNew = isNew;
        this.price = price;
        this.description = description;
        this.name = name;
        this.category = category;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public Boolean getNew() {
        return isNew;
    }

    public float getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public String getNewStatus(){
        if(this.isNew){
            return "New menu item!";
        } else{
            return "";
        }
    }

    public void printMenuItem(){
        System.out.println(getName() + ": " + getPrice() +" - "+getNewStatus());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return name.equals(menuItem.name) && category == menuItem.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, category);
    }
}
