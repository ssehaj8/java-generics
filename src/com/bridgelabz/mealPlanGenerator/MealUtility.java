package com.bridgelabz.mealPlanGenerator;

class MealUtility {
    // Validates and generates a meal plan dynamically
    public static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Generating personalized meal plan: ");
        meal.displayMeal();
    }
}

