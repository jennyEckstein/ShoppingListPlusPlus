package com.udacity.firebase.shoppinglistplusplus.model;

/**
 * Created by Jenny on 7/8/2016.
 */
public class Item {

    private String itemName;
    private String owner;

    public Item() {
    }

    public Item(String itemName, String owner) {
        this.itemName = itemName;
        this.owner = owner;
    }

    public String getItemName() {
        return itemName;
    }

    public String getOwner() {
        return owner;
    }
}
