package main;

import java.util.Arrays;
import java.util.Vector;

public class Circle {
  private  Point center;
  private double r;

    public Circle(Point center, double r) {
        this.center = center;
        this.r = r;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

}


