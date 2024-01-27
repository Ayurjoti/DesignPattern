package com.factorydesign;

import com.factorydesign.factory.OSFactory;
import com.factorydesign.os.OS;

public class OSProvider {

    public static void main(String[] args) {

        OS os = OSFactory.getInstance("Windows");
        os.print();
    }
}
