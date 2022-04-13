package Figures.AbstractFactory;

import Figures.Figure;
import Figures.Point;

import java.util.ArrayList;

public interface IRectangle {

    public Figure createRedRectangle(ArrayList<Point> points);
    public Figure createBlueRectangle(ArrayList<Point> points);

}
