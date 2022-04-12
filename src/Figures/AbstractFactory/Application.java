package Figures.AbstractFactory;

import Figures.Polygon;
import Figures.Rectangle;

public class Application {
    private AbstractFactory factory;
    private Rectangle rectangle;
    private Polygon polygon;

    public Application (AbstractFactory factory) {
        this.factory = factory;
    }

    public void setTheme() {
        factory.setTheme("red");
    }

    public void createRectangle() {
        this.rectangle = factory.createRectangle();
    }

    public void createPolygon() {
        this.polygon = factory.createPolygon();
    }

    public void paintMethod() {
        rectangle.setColor();
    }
}
