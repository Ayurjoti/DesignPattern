package com.creationaldesign.builderdesignpatter;

import com.creationaldesign.builderdesignpatter.Meal.Meal;
import com.creationaldesign.builderdesignpatter.Meal.MealBuilder;

public class BuilderPatterMealBuilder {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        //Veg Meal
        Meal Meal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        System.out.println("########");
        Meal.showItem();
        System.out.println("Total cost :" + Meal.getCost());
        System.out.println("\n");
        //NonVeg Meal
        Meal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non Veg Meal");
        System.out.println("############");
        Meal.showItem();
        System.out.println("Total cost :" + Meal.getCost());
    }
}
