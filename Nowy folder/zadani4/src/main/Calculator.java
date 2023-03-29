package main;

import static java.lang.Math.sqrt;

public class Calculator {

    public static String isPointInCircle(Circle circle, Point point){
        double a = circle.getCenter().getX();
        double x = point.getX();
        double b = circle.getCenter().getY();
        double y = point.getY();
        double r = circle.getR();
        double left = sqrt( ((x-a)*(x-a)) + ((y-b)*(y-b)) );
        if (left == r){
            return "Punkt na okręgu";
        }
        else if (left < r) {
            return "Punkt w okregu";
        }
        return "Punkt poza okręgiem";
    }


    public static double pole(Rectangle rec){
        double ax = rec.getA().getX();
        double ay = rec.getA().getY();
        double bx = rec.getB().getX();
        double by = rec.getB().getY();
        double cx = rec.getC().getX();
        double cy = rec.getC().getY();

        double ab = sqrt( ((ax-bx)*(ax-bx)) + ((ay-by)*(ay-by)) );
        double ac = sqrt( ((ax-cx)*(ax-cx)) + ((ay-cy)*(ay-cy)) );
        double bc = sqrt( ((bx-cx)*(bx-cx)) + ((by-cy)*(by-cy)) );

        if (ab > ac && ab > bc){
            return ac*bc;
        }
        else if (ac > ab && ac > bc){
            return  ab*bc;
        }
        return ab*bc;

    }
}
