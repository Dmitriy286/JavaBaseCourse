package Figures.AbstractFactory;

import Figures.Figure;
import Figures.Point;
import Figures.Polygon;
import Figures.Rectangle;

import java.util.ArrayList;

public interface IPolygon {

    public Figure createRedPolygon(ArrayList<Point> points);
    public Figure createBluePolygon(ArrayList<Point> points);
}
