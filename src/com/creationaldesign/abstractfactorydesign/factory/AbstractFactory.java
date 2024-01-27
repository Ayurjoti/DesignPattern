package com.creationaldesign.abstractfactorydesign.factory;

import com.creationaldesign.abstractfactorydesign.objects.colour.Colour;
import com.creationaldesign.abstractfactorydesign.objects.shape.Shape;

public abstract class AbstractFactory {
    abstract Colour getColour(String colour);
    abstract Shape getShape(String Shape);
}
