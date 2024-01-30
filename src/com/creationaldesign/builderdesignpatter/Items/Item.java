package com.creationaldesign.builderdesignpatter.Items;

import com.creationaldesign.builderdesignpatter.packing.Packing;

public interface Item {
    String name();
    Packing pack();
    float price();
}
