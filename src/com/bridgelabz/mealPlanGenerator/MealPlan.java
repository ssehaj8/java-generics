package com.bridgelabz.mealPlanGenerator;

interface MealPlan {
    void displayMeal();
}

class VegetarianMeal implements MealPlan {
    private String mainDish;  // Main course for the meal

    public VegetarianMeal(String mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void displayMeal() {
        System.out.println("Vegetarian Meal: " + mainDish);
    }
}

class NonVegetarianMeal implements MealPlan {
    private String mainDish;

    public NonVegetarianMeal(String mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void displayMeal() {
        System.out.println("NonVegetarian Meal: " + mainDish);
    }
}

class HighProteinMeal implements MealPlan {
    private String mainDish;

    public HighProteinMeal(String mainDish) {
        this.mainDish = mainDish;
    }

    @Override
    public void displayMeal() {
        System.out.println("High-Protein Meal: " + mainDish);
    }
}
