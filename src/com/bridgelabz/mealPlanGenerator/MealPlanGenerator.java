package com.bridgelabz.mealPlanGenerator;
import java.util.*;

public class MealPlanGenerator {
    public static void main(String[] args) {
        // Creating different meal objects
        VegetarianMeal vegMeal = new VegetarianMeal("Grilled Paneer with Vegetables");
        NonVegetarianMeal nonVegetarianMeal = new NonVegetarianMeal("Stuff Champ gravy with vegetables");
        HighProteinMeal proteinMeal = new HighProteinMeal("Grilled Chicken with Brown Rice");

        // Managing Vegetarian Meals
        Meal<VegetarianMeal> vegetarianPlan = new Meal<>();
        vegetarianPlan.addMeal(vegMeal);

        // Managing Non-vegetarian Meals
        Meal<NonVegetarianMeal> nonVegetarianplan = new Meal<>();
        nonVegetarianplan.addMeal(nonVegetarianMeal);


        // Managing High-Protein Meals
        Meal<HighProteinMeal> proteinPlan = new Meal<>();
        proteinPlan.addMeal(proteinMeal);

        // Display all meal plans by category
        System.out.println("Vegetarian Meal Plan");
        vegetarianPlan.displayMealPlan();

        System.out.println("Non-Vegetarian Meal Plan");
        nonVegetarianplan.displayMealPlan();

        System.out.println("High-Protein Meal Plan");
        proteinPlan.displayMealPlan();

        // Using generic method to generate personalized meals
        System.out.println("\n--- Generating Personalized Meals ---");
        MealUtility.generateMealPlan(vegMeal);
        MealUtility.generateMealPlan(nonVegetarianMeal);
        MealUtility.generateMealPlan(proteinMeal);
    }
}

/*
Vegetarian Meal Plan
Vegetarian Meal: Grilled Paneer with Vegetables
Non-Vegetarian Meal Plan
NonVegetarian Meal: Stuff Champ gravy with vegetables
High-Protein Meal Plan
High-Protein Meal: Grilled Chicken with Brown Rice

--- Generating Personalized Meals ---
Generating personalized meal plan:
Vegetarian Meal: Grilled Paneer with Vegetables
Generating personalized meal plan:
NonVegetarian Meal: Stuff Champ gravy with vegetables
Generating personalized meal plan:
High-Protein Meal: Grilled Chicken with Brown Rice
 */