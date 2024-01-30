package com.creationaldesign.builderdesignpatter.Items.objects;

import com.creationaldesign.builderdesignpatter.Items.Item;
import com.creationaldesign.builderdesignpatter.packing.Packing;
import com.creationaldesign.builderdesignpatter.packing.objects.Bottle;

public abstract class ColdDrink implements Item {

    @Override
    public Packing pack() {
        return new Bottle();
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
