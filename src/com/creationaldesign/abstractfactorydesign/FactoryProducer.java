package com.creationaldesign.abstractfactorydesign;

import com.creationaldesign.abstractfactorydesign.factory.AbstractFactory;
import com.creationaldesign.abstractfactorydesign.factory.ColourFactory;
import com.creationaldesign.abstractfactorydesign.factory.ShapeFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if (choice.equalsIgnoreCase("color")){
            return new ColourFactory();
        } else if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        }
        return null;
    }
}
