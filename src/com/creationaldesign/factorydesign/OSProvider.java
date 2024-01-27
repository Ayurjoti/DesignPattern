package com.creationaldesign.factorydesign;

import com.creationaldesign.factorydesign.factory.OSFactory;
import com.creationaldesign.factorydesign.os.OS;

public class OSProvider {

    public static void main(String[] args) {

        OS os = OSFactory.getInstance("Windows");
        os.print();
    }
}
