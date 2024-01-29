package com.creationaldesign.abstractfactorydesign.factory;

import com.creationaldesign.abstractfactorydesign.objects.colour.Colour;
import com.creationaldesign.abstractfactorydesign.objects.shape.CircleShape;
import com.creationaldesign.abstractfactorydesign.objects.shape.Shape;
import com.creationaldesign.abstractfactorydesign.objects.shape.SquareShape;
import com.creationaldesign.abstractfactorydesign.objects.shape.TriangleShape;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Colour getColour(String colour) {
        return null;
    }

    @Override
    public Shape getShape(String Shape) {
        if (Shape == null)
            return null;

        if (Shape.equalsIgnoreCase("Circle"))
            return new CircleShape();
        else if (Shape.equalsIgnoreCase("SQUARE"))
            return new SquareShape();
        else if (Shape.equalsIgnoreCase("TRIANGLE"))
            return new TriangleShape();

        return null;
    }
}
