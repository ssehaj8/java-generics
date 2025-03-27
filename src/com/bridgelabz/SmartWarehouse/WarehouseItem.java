package com.bridgelabz.SmartWarehouse;

// Abstract class representing a general warehouse item
abstract class WarehouseItem {
    private String name;
    private double weight;

    public WarehouseItem(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }
    public double getWeight() {
        return weight;
    }

    public abstract void displayItemDetails(); // display item details
}


// Electronics category
class Electronics extends WarehouseItem {
    private String brand;

    public Electronics(String name, String brand, double weight) {
        super(name, weight);
        this.brand = brand;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Electronics: " + getName() + " | Brand: " + brand);
    }
}

// Groceries category
class Groceries extends WarehouseItem {
    private String expiryDate;

    public Groceries(String name, String expiryDate, double weight) {
        super(name, weight);
        this.expiryDate = expiryDate;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Grocery: " + getName() + " | Expiry Date: " + expiryDate);
    }
}

// Furniture category
class Furniture extends WarehouseItem {
    private String material;

    public Furniture(String name, String material, double weight) {
        super(name,weight);
        this.material = material;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Furniture: "+ getName() +"Material: "+ material+ "Weight: "+ getWeight()+"kg");
    }
}
