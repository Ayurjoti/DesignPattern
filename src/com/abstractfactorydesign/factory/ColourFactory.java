package com.abstractfactorydesign.factory;

import com.abstractfactorydesign.objects.colour.BlueColour;
import com.abstractfactorydesign.objects.colour.Colour;
import com.abstractfactorydesign.objects.colour.GreenColour;
import com.abstractfactorydesign.objects.colour.RedColour;
import com.abstractfactorydesign.objects.shape.Shape;

public class ColourFactory extends AbstractFactory{
    @Override
    Colour getColour(String colour) {
        if (colour == null)
            return null;

        if (colour.equalsIgnoreCase("RED"))
            return new RedColour();
        else if (colour.equalsIgnoreCase("GREEN"))
            return new GreenColour();
        else if (colour.equalsIgnoreCase("Blue"))
            return new BlueColour();

        return null;
    }

    @Override
    Shape getShape(String Shape) {
        return null;
    }
}
