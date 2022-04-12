package Figures.AbstractFactory;

import Figures.Polygon;
import Figures.Rectangle;

public class RedFiguresFactory implements IFigureFactory{


    public Rectangle createRectangle () {
        return new RedRectangleCreator();
    }

    public Polygon createPolygon() {

        return new RedPolygonCreator;
    }
}
