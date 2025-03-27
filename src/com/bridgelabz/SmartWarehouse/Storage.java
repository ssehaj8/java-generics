package com.bridgelabz.smartWarehouse;
import java.util.*;

public class Storage<T extends WarehouseItem> {
    private List<T> items = new ArrayList<>();

    public void addItem(T item) {
        items.add(item);
    }

    public void removeItem(T item) {
        items.remove(item);
    }

    public List<T> getItems() {
        return items;
    }

    public void displayAllItems() {
        for (T item : items) {
            item.displayItemDetails();
        }
    }
}


// Generic booking system for tracking orders
class WarehouseBooking<T> {
    private T bookingId;
    private WarehouseItem item;
    private String customerName;

    public WarehouseBooking(T bookingId, WarehouseItem item, String customerName) {
        this.bookingId = bookingId;
        this.item = item;
        this.customerName = customerName;
    }

    public void displayBookingInfo() {
        System.out.println("Booking ID: " + bookingId);
        System.out.println("Customer: " + customerName);
        item.displayItemDetails();
    }
}

// Manages different storage sections
class WarehouseManager<T extends Number> {
    private List<Storage<? extends WarehouseItem>> storages = new ArrayList<>();

    public void addStorage(Storage<? extends WarehouseItem> storage) {
        storages.add(storage);
    }

    public void displayAllStorageItems() {
        for (Storage<? extends WarehouseItem> storage : storages) {
            storage.displayAllItems();
        }
    }
}
