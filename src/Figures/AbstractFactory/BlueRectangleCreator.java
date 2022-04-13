package Figures.AbstractFactory;

import Figures.Figure;
import Figures.Point;
import Figures.Polygon;
import Figures.Rectangle;

import java.util.ArrayList;

public class BlueRectangleCreator implements IRectangle {
    @Override
    public Figure createBlueRectangle(ArrayList<Point> points) {
        Figure rectangle = new Rectangle(points);
        return rectangle;
    }

    public void paint() {
        ArrayList<Point> points = null;
        createBlueRectangle(points).setColor("blue"); //todo????????
    }
}
