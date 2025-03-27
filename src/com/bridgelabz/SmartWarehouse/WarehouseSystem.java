package com.bridgelabz.SmartWarehouse;

public class WarehouseSystem {
    public static void main(String[] args) {
        // Creating different warehouse items with weight
        Electronics laptop = new Electronics("Laptop", "Dell", 2.5);
        Electronics phone= new Electronics("Mobile Phone", "Apple" , 0.4);

        Groceries chocalate = new Groceries("Chocalate", "25/07/2025", 1.0);
        Groceries apple = new Groceries("Apple", "28/12/2025", 0.2);

        Furniture chair = new Furniture("Chair", "Wood", 7.5);
        Furniture table = new Furniture("Table", "Glass", 15.0);

        // Creating storages for each category
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(laptop);
        electronicsStorage.addItem(phone);

        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(chocalate);
        groceriesStorage.addItem(apple);

        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(chair);
        furnitureStorage.addItem(table);

        // Creating warehouse bookings
        WarehouseBooking<Integer> booking1 = new WarehouseBooking<>(1001, laptop, "Sehaj");
        WarehouseBooking<String> booking2 = new WarehouseBooking<>("B202", apple, "Bhawishya");

        // Displaying booking information
        booking1.displayBookingInfo();

        booking2.displayBookingInfo();

        // Managing warehouse storage
        System.out.println("Warehouse Management");
        WarehouseManager<Integer> manager = new WarehouseManager<>();
        manager.addStorage(electronicsStorage);
        manager.addStorage(groceriesStorage);
        manager.addStorage(furnitureStorage);
        manager.displayAllStorageItems();
    }
}
/*

O/P->
Booking ID: 1001
Customer: Sehaj
Electronics: Laptop | Brand: Dell
Booking ID: B202
Customer: Bhawishya
Grocery: Apple | Expiry Date: 28/12/2025
Warehouse Management
Electronics: Laptop | Brand: Dell
Electronics: Mobile Phone | Brand: Apple
Grocery: Chocalate | Expiry Date: 25/07/2025
Grocery: Apple | Expiry Date: 28/12/2025
Furniture: ChairMaterial: WoodWeight: 7.5kg
Furniture: TableMaterial: GlassWeight: 15.0kg

 */
