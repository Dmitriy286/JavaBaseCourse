package Figures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Pentangle extends Figure {

    public Pentangle (ArrayList<Point> pointsList) {
        super(pointsList);
    }

    //fixme почему не переопределяется?
//    @Override
//    public String getName() {
//        return "Пятиугольник";
//    }


//    @Override
//    public String toString() {
//        return "Pentangle: " +
//                "точка a: " + getPoint("p1") +
//                ", точка b: " + getPoint("p2") +
//                ", точка c: " + getPoint("p3") +
//                ", точка d: " + getPoint("p4") +
//                ", точка e: " + getPoint("p5");
//    }

    public Map<String, Point> getPointsMap() {
        Map<String, Point> pointsMap = new HashMap<String, Point>();
        int number = 1;
        for (var point: pointsList) {
            pointsMap.put("p" + number, point);
            number += 1;
        }
        return pointsMap;
    }

    public Point getPoint(String p) {
        return getPointsMap().get(p);
    }

}
