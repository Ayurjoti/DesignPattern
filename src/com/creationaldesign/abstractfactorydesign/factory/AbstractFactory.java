package com.creationaldesign.abstractfactorydesign.factory;

import com.creationaldesign.abstractfactorydesign.objects.colour.Colour;
import com.creationaldesign.abstractfactorydesign.objects.shape.Shape;

public abstract class AbstractFactory {
    public abstract Colour getColour(String colour);
    public abstract Shape getShape(String Shape);
}
