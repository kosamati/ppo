package main;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PointTest {

    @Test
    public void testConstructor() {
        Point p = new Point(3.0, 4.0);
        assertEquals(3.0, p.getX(), 0.001);
        assertEquals(4.0, p.getY(), 0.001);
    }

    @Test
    public void testGetX() {
        Point p = new Point(2.0, 5.0);
        assertEquals(2.0, p.getX(), 0.001);
    }

    @Test
    public void testSetX() {
        Point p = new Point(1.0, 3.0);
        p.setX(4.0);
        assertEquals(4.0, p.getX(), 0.001);
    }

    @Test
    public void testGetY() {
        Point p = new Point(2.0, 5.0);
        assertEquals(5.0, p.getY(), 0.001);
    }

    @Test
    public void testSetY() {
        Point p = new Point(1.0, 3.0);
        p.setY(6.0);
        assertEquals(6.0, p.getY(), 0.001);
    }

}
