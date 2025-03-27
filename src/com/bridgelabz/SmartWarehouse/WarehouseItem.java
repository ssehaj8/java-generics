package com.bridgelabz.SmartWarehouse;

//Abstract class representing a general warehouse item
abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void displayItemDetails();
}