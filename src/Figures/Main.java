package Figures;

import Figures.FabricMethod.FigureCreator;
import Figures.FabricMethod.ICreateFigure;
import com.company.Human;

import java.util.ArrayList;
import java.util.Random;

public class Main {

        public static void main(String[] args) {
            Point p1 = new Point(2.5, 2.2);
            Point p2 = new Point(3.1, 3.9);
            Point p3 = new Point(4, 4);
            Point p4 = new axisPoint(0,5);

            System.out.println(p1.toString()); //нет необходимости вызывать метод toString
            System.out.println(p2.toString());
            System.out.println(p3.toString());

            System.out.println(p1);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println(p4);

            System.out.println("-------------");
            ArrayList<Point> arrayList1 = new ArrayList<Point>(0);
            arrayList1.add(p1);
            arrayList1.add(p2);
            arrayList1.add(p3);

            Triangle triangle = new Triangle(arrayList1);
            System.out.println("Площадь треугольника по новой функции: ");
            System.out.println(triangle.getSquare());

            //todo Отдельный метод
//            int n = 5;
//            Point[] points = new Point[5];
//            Random random = new Random();
//            for (int i = 0; i < n; i++) {
//                points[i] = new Point(-3 + (n/2 - i) * random.nextInt(0, 5), -2 + random.nextInt(-2, 2));
//            }

            Point penta1 = new Point(-3, -2);
            Point penta2 = new Point(-1, 4);
            Point penta3 = new Point(6, 1);
            Point penta4 = new Point(3, 10);
            Point penta5 = new Point(-4, 9);

            ArrayList<Point> arrayList2 = new ArrayList<Point>(0);

            //fixme можно как-нибудь так?
//            for (int i = 0; i < 5; i++) {
//                arrayList2.add(penta{%i});
//            }

            arrayList2.add(penta1);
            arrayList2.add(penta2);
            arrayList2.add(penta3);
            arrayList2.add(penta4);
            arrayList2.add(penta5);

            Pentangle pentangle = new Pentangle(arrayList2);
            System.out.println(arrayList2);

            System.out.println("Пятиугольник: ");
            System.out.println(pentangle);
            System.out.println(pentangle.getSquare());
            System.out.println(pentangle.getPerimetr());

            ArrayList<Point> arrayList3 = new ArrayList<Point>(0);
            arrayList3.add(p1);
            arrayList3.add(p2);
            System.out.println("Круг: ");
            Circle circle1 = new Circle(arrayList3);
            System.out.println(circle1.getRadius());
            System.out.println(circle1);
            System.out.println(circle1.getCircumference());
            System.out.println(circle1.getSquare());

            System.out.println("Новый вариант toString");
            System.out.println(pentangle);

            FigureCreator creator = new FigureCreator();
            Figure newFigure = creator.create(arrayList2); //fixme ??????????????????????????????
            System.out.println(newFigure);


//            Triangle triangle = new Triangle(p1, p2, p3);
//            Figure f1 = new Triangle(p1, p2, p3);
//            Figure f2 = new Rectangle(p1, p2, p3, p4);
//            Triangle triOne = new Triangle(p1, p2, p3);
//            Rectangle rectOne = new Rectangle(p1, p2, p3, p4);
////            Figure f3 = new Figure();
//            Figure f4 = (Figure)triangle; //upcast
//            ((Triangle)f4).getA(); //downcast
//
////            f3.getPerimetr();// - невозможно
//
//        Figure rect1 = new Rectangle(new Point(0, 0), p1, p2, p3);
//        System.out.println(rect1);
//
//            Triangle triTwo = new Triangle(p1, p2, p3);
//            System.out.println(triOne);
//
//            System.out.println(triOne.getTriangleSquare());

        }
}
