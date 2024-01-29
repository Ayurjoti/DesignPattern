package com.creationaldesign.abstractfactorydesign.factory;

import com.creationaldesign.abstractfactorydesign.objects.colour.BlueColour;
import com.creationaldesign.abstractfactorydesign.objects.colour.Colour;
import com.creationaldesign.abstractfactorydesign.objects.colour.GreenColour;
import com.creationaldesign.abstractfactorydesign.objects.colour.RedColour;
import com.creationaldesign.abstractfactorydesign.objects.shape.Shape;

public class ColourFactory extends AbstractFactory{
    @Override
    public Colour getColour(String colour) {
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
    public Shape getShape(String Shape) {
        return null;
    }
}
