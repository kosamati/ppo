package main;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testIsPointInCircleOnCircle() {
        Point center = new Point(1.0, 2.0);
        Circle circle = new Circle(center, 3.0);
        Point point = new Point(4.0, 2.0);
        String result = Calculator.isPointInCircle(circle, point);
        assertEquals("Punkt na okręgu", result);
    }

    @Test
    public void testIsPointInCircleInsideCircle() {
        Point center = new Point(1.0, 2.0);
        Circle circle = new Circle(center, 3.0);
        Point point = new Point(2.0, 2.0);
        String result = Calculator.isPointInCircle(circle, point);
        assertEquals("Punkt w okregu", result);
    }

    @Test
    public void testIsPointInCircleOutsideCircle() {
        Point center = new Point(1.0, 2.0);
        Circle circle = new Circle(center, 3.0);
        Point point = new Point(7.0, 2.0);
        String result = Calculator.isPointInCircle(circle, point);
        assertEquals("Punkt poza okręgiem", result);
    }

    @Test
    public void testPoleRectangle() {
        Point a = new Point(1.0, 1.0);
        Point b = new Point(4.0, 1.0);
        Point c = new Point(4.0, 3.0);
        Point d = new Point(1.0, 3.0);
        Rectangle rec = new Rectangle(a, b, c, d);
        double result = Calculator.pole(rec);
        assertEquals(6.0, result, 0.001);
    }

}
