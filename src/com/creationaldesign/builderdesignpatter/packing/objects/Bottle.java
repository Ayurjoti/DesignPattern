package com.creationaldesign.builderdesignpatter.packing.objects;

import com.creationaldesign.builderdesignpatter.packing.Packing;

public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
