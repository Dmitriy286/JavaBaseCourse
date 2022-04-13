package Figures.AbstractFactory;

import Figures.Figure;
import Figures.Point;
import Figures.Polygon;
import Figures.Rectangle;

import java.util.ArrayList;
import java.util.Arrays;

public class Application {
    private AbstractFactory factory;
    private Figure rectangle;
    private Figure polygon;

    public Application (AbstractFactory factory) {
        this.factory = factory;
    }

    public void setTheme() {
        factory.setTheme("red");
    }

    public void createRectangle() {
        this.rectangle = factory.createRectangle(new ArrayList<>(Arrays.asList(new Point(1, 1), new Point(2, 2))));
    }

    public void createPolygon() {
        this.polygon = factory.createPolygon(new ArrayList<>(Arrays.asList(new Point(1, 1), new Point(2, 2))));
    }

}
