package com.creationaldesign.builderdesignpatter.Items.objects;

public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 110.0f;
    }
}
