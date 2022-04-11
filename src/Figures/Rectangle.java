//package Figures;
//
//public class Rectangle extends Figure {
//    private Point a;
//    private Point b;
//    private Point c;
//    private Point d;
//
//    double sideOne;
//    double sideTwo;
//    double sideThree;
//    double sideFour;
//
//    public Rectangle (Point a, Point b, Point c, Point d) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//        this.d = d;
//
//        sideOne = sideLengthCalculating(this.a, this.b);
//        sideTwo = sideLengthCalculating(this.b, this.c);
//        sideThree = sideLengthCalculating(this.c, this.d);
//        sideFour = sideLengthCalculating(this.d, this.a);
//
//    }
//
//    public Point getA() {
//        return a;
//    }
//
//    public Point getB() {
//        return b;
//    }
//
//    public Point getC() {
//        return c;
//    }
//
//    public Point getD() {
//        return d;
//    }
//
//    @Override
//    public String toString() {
//        return "Rectangle: " +
//                "точка a: " + a +
//                ", точка b: " + b +
//                ", точка c: " + c +
//                ", точка d: " + d;
//    }
//
//
//    public static double sideLengthCalculating(Point one, Point two) {
//        double x1 = one.getX();
//        double y1 = one.getY();
//        double x2 = two.getX();
//        double y2 = two.getY();
//
//        return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
//    }
//
//
//
//    //fixme - почему он просит имплементировать абстрактный метод площадь и периметр?
//    public double getRectanglePerimetr(Point one, Point two, Point three, Point four) {
//        return sideOne + sideTwo + sideThree + sideFour;
//    }
//
//    public double getRectangleSquare(Point one, Point two, Point three, Point four) {
//        double halfPerimetr = getRectanglePerimetr(one, two, three, four) / 2;
//
//        double rectangleSquare = Math.sqrt((halfPerimetr - sideOne) * (halfPerimetr - sideTwo)
//                * (halfPerimetr - sideThree) * (halfPerimetr - sideFour));
//
//        System.out.println(rectangleSquare);
//        return rectangleSquare;
//    }
//
//}
//
//
