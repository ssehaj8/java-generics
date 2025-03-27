package com.bridgelabz.OnlineMarketplace;


public class OnlineMarketPlace {
    public static void main(String[] args) {
        // Create products
        Product<BookCategory> book1 = new Product<>("5 feet apart", 350, BookCategory.FICTION);
        Product<ClothingCategory> clothing1 = new Product<>("T-Shirt", 799, ClothingCategory.MEN);
        Product<GadgetCategory> gadget1 = new Product<>("Smartphone", 52000, GadgetCategory.MOBILE);

        // Create catalogs
        ProductCatalog<BookCategory> bookCatalog = new ProductCatalog<>();
        ProductCatalog<ClothingCategory> clothingCatalog = new ProductCatalog<>();
        ProductCatalog<GadgetCategory> gadgetCatalog = new ProductCatalog<>();

        // Add products to catalogs
        bookCatalog.addProduct(book1);
        clothingCatalog.addProduct(clothing1);
        gadgetCatalog.addProduct(gadget1);

        // Display catalogs
        bookCatalog.displayCatalog();
        clothingCatalog.displayCatalog();
        gadgetCatalog.displayCatalog();

        // Apply discounts
        System.out.println("\nApplying Discounts...");
        ProductUtils.applyDiscount(book1, 10);  // 10% discount on book
        ProductUtils.applyDiscount(clothing1, 30);  // 5% discount on clothing
        ProductUtils.applyDiscount(gadget1, 8);  // 15% discount on gadget

        // Display updated catalogs
        bookCatalog.displayCatalog();
        clothingCatalog.displayCatalog();
        gadgetCatalog.displayCatalog();
    }
}
/*
Product Catalog
Product: 5 feet apartPrice: Rs350.0Category: FICTION
Product Catalog
Product: T-ShirtPrice: Rs799.0Category: MEN
Product Catalog
Product: SmartphonePrice: Rs52000.0Category: MOBILE

Applying Discounts...
Discount applied: 10.0% off on 5 feet apart. New Price: 315.0
Discount applied: 30.0% off on T-Shirt. New Price: 559.3
Discount applied: 8.0% off on Smartphone. New Price: 47840.0
Product Catalog
Product: 5 feet apartPrice: Rs315.0Category: FICTION
Product Catalog
Product: T-ShirtPrice: Rs559.3Category: MEN
Product Catalog
Product: SmartphonePrice: Rs47840.0Category: MOBILE
 */