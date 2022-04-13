package Figures.AbstractFactory;

import Figures.Figure;
import Figures.Point;
import Figures.Rectangle;

import java.util.ArrayList;

public class RedRectangleCreator implements IRectangle {
    @Override
    public Figure createRedRectangle(ArrayList<Point> points) {
        Figure rectangle = new Rectangle(points);
        return rectangle;
    }

    public void paint() {
        ArrayList<Point> points = null;
        createRedRectangle(points).setColor("red"); //todo????????
    }

}
