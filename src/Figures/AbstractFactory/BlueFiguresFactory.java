package Figures.AbstractFactory;

import Figures.Polygon;
import Figures.Rectangle;

public class BlueFiguresFactory implements IFigureFactory{


    public Rectangle createRectangle () {

        return new BlueRectangleCreator();
    }

    public Polygon createPolygon() {

        return new BluePolygonCreator;
    }

}
