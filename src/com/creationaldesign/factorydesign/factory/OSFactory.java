package com.creationaldesign.factorydesign.factory;

import com.creationaldesign.factorydesign.os.OS;
import com.creationaldesign.factorydesign.os.impl.Android;
import com.creationaldesign.factorydesign.os.impl.IOS;
import com.creationaldesign.factorydesign.os.impl.ObsoleteOS;
import com.creationaldesign.factorydesign.os.impl.Windows;

public class OSFactory {
    private OSFactory() {
    }

    public static OS getInstance(String str) {
        if (str.equalsIgnoreCase("Windows"))
            return new Windows();
        else if (str.equalsIgnoreCase("Android"))
            return new Android();
        else if (str.equalsIgnoreCase("IOS"))
            return new IOS();
        else
            return new ObsoleteOS();
    }
}
