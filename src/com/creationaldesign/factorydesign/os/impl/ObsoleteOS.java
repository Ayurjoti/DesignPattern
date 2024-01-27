package com.creationaldesign.factorydesign.os.impl;

import com.creationaldesign.factorydesign.os.OS;

public class ObsoleteOS implements OS {
    @Override
    public void print() {
        System.out.println("Other Obsolete OS of incompatible type");
    }
}
