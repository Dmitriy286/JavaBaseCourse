package Figures.AbstractFactory;

import Figures.FabricMethod.ICreateFigure;
import Figures.Figure;
import Figures.Point;
import Figures.Polygon;
import Figures.Rectangle;

import java.util.ArrayList;

public class RectangleCreator implements IRectangle {

    public Figure createRectangle(ArrayList<Point> points) {
        Figure rectangle = new Rectangle(points);
        return rectangle;
    }

    public void paint(String color) {
        ArrayList<Point> points = null;
        createRectangle(points).setColor(color); //todo????????
    }
}
