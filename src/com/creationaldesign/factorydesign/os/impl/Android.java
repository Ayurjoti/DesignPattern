package com.creationaldesign.factorydesign.os.impl;

import com.creationaldesign.factorydesign.os.OS;

public class Android implements OS {
    @Override
    public void print() {
        System.out.println("This is an android OS");
    }
}
