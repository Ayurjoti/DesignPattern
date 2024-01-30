package com.creationaldesign.builderdesignpatter.packing.objects;

import com.creationaldesign.builderdesignpatter.packing.Packing;

public class Wrapper implements Packing {
    @Override
    public String pack() {
        return "Wrapper";
    }
}
