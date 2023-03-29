package main;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    public void testConstructor() {
        Point p = new Point(1.0, 2.0);
        Circle c = new Circle(p, 3.0);
        assertEquals(p, c.getCenter());
        assertEquals(3.0, c.getR(), 0.001);
    }

    @Test
    public void testGetCenter() {
        Point p = new Point(1.0, 2.0);
        Circle c = new Circle(p, 3.0);
        assertEquals(p, c.getCenter());
    }

    @Test
    public void testSetCenter() {
        Point p1 = new Point(1.0, 2.0);
        Point p2 = new Point(3.0, 4.0);
        Circle c = new Circle(p1, 3.0);
        c.setCenter(p2);
        assertEquals(p2, c.getCenter());
    }

    @Test
    public void testGetR() {
        Point p = new Point(1.0, 2.0);
        Circle c = new Circle(p, 3.0);
        assertEquals(3.0, c.getR(), 0.001);
    }

    @Test
    public void testSetR() {
        Point p = new Point(1.0, 2.0);
        Circle c = new Circle(p, 3.0);
        c.setR(4.0);
        assertEquals(4.0, c.getR(), 0.001);
    }

}
