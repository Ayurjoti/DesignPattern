package com.creationaldesign.builderdesignpatter.Meal;

import com.creationaldesign.builderdesignpatter.Items.objects.ChickenBurger;
import com.creationaldesign.builderdesignpatter.Items.objects.Coke;
import com.creationaldesign.builderdesignpatter.Items.objects.Pepsi;
import com.creationaldesign.builderdesignpatter.Items.objects.VegBurger;

public class MealBuilder {
    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Coke());
        return meal;
    }
}
