package Figures.AbstractFactory;

import Figures.Figure;
import Figures.Point;
import Figures.Polygon;
import Figures.Rectangle;

import java.util.ArrayList;

public class BluePolygonCreator implements IPolygon {

    @Override
    public Figure createBluePolygon(ArrayList<Point> points) {
        Figure polygon = new Polygon(points);
        return polygon;
    }

    public void paint() {
        ArrayList<Point> points = null;
        createBluePolygon(points).setColor("blue"); //todo????????
    }

}
