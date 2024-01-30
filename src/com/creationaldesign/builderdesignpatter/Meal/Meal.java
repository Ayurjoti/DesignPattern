package com.creationaldesign.builderdesignpatter.Meal;

import com.creationaldesign.builderdesignpatter.Items.Item;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private final List<Item> items = new ArrayList<>();

    public float getCost () {
        float cost = 0.0f;
        for (Item item : items)
            cost += item.price();
        return cost;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void showItem() {
        for (Item item : items) {
            System.out.println("Item : " + item.name());
            System.out.println("Packing : " + item.pack().pack());
            System.out.println("Price : " + item.price());
        }
    }
}
