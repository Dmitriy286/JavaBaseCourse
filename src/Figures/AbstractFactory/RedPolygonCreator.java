package Figures.AbstractFactory;

import Figures.Figure;
import Figures.Point;
import Figures.Polygon;
import Figures.Rectangle;

import java.util.ArrayList;

public class RedPolygonCreator implements IPolygon{

    @Override
    public Figure createRedPolygon(ArrayList<Point> points) {
        Figure polygon = new Polygon(points);
        return polygon;
    }

    public void paint() {
        ArrayList<Point> points = null;
        createRedPolygon(points).setColor("red"); //todo????????
        }


}
