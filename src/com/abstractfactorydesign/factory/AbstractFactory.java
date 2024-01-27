package com.abstractfactorydesign.factory;

import com.abstractfactorydesign.objects.colour.Colour;
import com.abstractfactorydesign.objects.shape.Shape;

public abstract class AbstractFactory {
    abstract Colour getColour(String colour);
    abstract Shape getShape(String Shape);
}
