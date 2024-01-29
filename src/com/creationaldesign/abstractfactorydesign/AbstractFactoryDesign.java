package com.creationaldesign.abstractfactorydesign;

import com.creationaldesign.abstractfactorydesign.factory.AbstractFactory;
import com.creationaldesign.abstractfactorydesign.objects.colour.Colour;
import com.creationaldesign.abstractfactorydesign.objects.shape.Shape;


public class AbstractFactoryDesign {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");
        assert shapeFactory != null;
        Shape shape = shapeFactory.getShape("circle");
        shape.draw();

        AbstractFactory colorFactory =FactoryProducer.getFactory("Color");
        Colour colour = colorFactory.getColour("red");
        colour.fill();
    }
}
