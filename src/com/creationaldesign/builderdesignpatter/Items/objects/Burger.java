package com.creationaldesign.builderdesignpatter.Items.objects;


import com.creationaldesign.builderdesignpatter.Items.Item;
import com.creationaldesign.builderdesignpatter.packing.Packing;
import com.creationaldesign.builderdesignpatter.packing.objects.Wrapper;

public abstract class Burger implements Item {

    @Override
    public Packing pack() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
