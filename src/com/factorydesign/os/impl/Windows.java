package com.factorydesign.os.impl;

import com.factorydesign.os.OS;

public class Windows implements OS {
    @Override
    public void print() {
        System.out.println("This is a windows OS");
    }
}
