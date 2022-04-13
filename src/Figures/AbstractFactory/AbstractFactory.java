package Figures.AbstractFactory;

import Figures.FabricMethod.ICreateFigure;
import Figures.Figure;
import Figures.Point;
import Figures.Polygon;
import Figures.Rectangle;

import java.util.ArrayList;

public class AbstractFactory implements IFigureFactory {
    String theme;

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public Figure create(ArrayList<Point> points) {
        ICreateFigure factory;
        if (theme == "red") {
            factory = new RedFiguresFactory();
        } else if (theme == "blue") {
            factory = new BlueFiguresFactory();
        }
        return factory.create(ArrayList<Point> points);
    }
}
