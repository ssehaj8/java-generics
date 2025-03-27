package com.bridgelabz.mealPlanGenerator;

import java.util.ArrayList;
import java.util.List;

class Meal<T extends MealPlan> {
    private List<T> mealList = new ArrayList<>();

    public void addMeal(T meal) {
        mealList.add(meal);
    }

    public void displayMealPlan() {
        for (T meal : mealList) {
            meal.displayMeal();
        }
    }
}
