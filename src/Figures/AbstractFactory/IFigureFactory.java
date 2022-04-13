package Figures.AbstractFactory;

import Figures.Point;
import Figures.Polygon;
import Figures.Rectangle;

import java.util.ArrayList;

public interface IFigureFactory {

    public Rectangle createRectangle(ArrayList<Point> points);
    public Polygon createPolygon(ArrayList<Point> points);


}
