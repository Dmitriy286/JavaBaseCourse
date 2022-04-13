package Figures;

import java.util.ArrayList;

public abstract class Figure {
    ArrayList<Point> pointsList;
    private String color;

    public Figure (ArrayList<Point> pointsList) {
        this.pointsList = pointsList;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
    return "Привет, я " + this.getClass().getSimpleName() + " с точками: " + this.pointsList + ". Мой цвет: " + this.color;
    }

    public Point getNextPoint(int index) {
        if (index == pointsList.size() - 1) {
            return pointsList.get(0);
        }
       else {
           return pointsList.get(index + 1);
        }
    }

    public static double getSideLength(Point one, Point two) {
        double x1 = one.getX();
        double y1 = one.getY();
        double x2 = two.getX();
        double y2 = two.getY();

        double sideLength = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        return sideLength;
    }

    public double getPerimetr() {
        double perimetr = 0;
        int index = 0;
        for (var element: pointsList) {
            perimetr += getSideLength(element, getNextPoint(index));
            index += 1;
        }
        return perimetr;
    }

    public double getSquare() {
        double firstSum = 0;
        double secondSum = 0;
        double square = 0;
        int index = 0;
        for (var point: pointsList) {
            firstSum += point.getX() * getNextPoint(index).getY();
            secondSum += point.getY() * getNextPoint(index).getX();
            index += 1;
        }
        square = Math.abs(firstSum - secondSum) / 2;
        return square;
    }

}