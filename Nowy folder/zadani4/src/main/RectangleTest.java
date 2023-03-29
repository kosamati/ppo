package main;

import org.testng.annotations.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RectangleTest {

    @Test
    public void testConstructor() {
        Point a = new Point(1.0, 2.0);
        Point b = new Point(3.0, 4.0);
        Point c = new Point(5.0, 6.0);
        Point d = new Point(7.0, 8.0);
        Rectangle r = new Rectangle(a, b, c, d);
        assertEquals(a, r.getA());
        assertEquals(b, r.getB());
        assertEquals(c, r.getC());
        assertEquals(d, r.getD());
    }

    @Test
    public void testGetA() {
        Point a = new Point(1.0, 2.0);
        Rectangle r = new Rectangle(a, new Point(3.0, 4.0), new Point(5.0, 6.0), new Point(7.0, 8.0));
        assertEquals(a, r.getA());
    }

    @Test
    public void testSetA() {
        Point a1 = new Point(1.0, 2.0);
        Point a2 = new Point(3.0, 4.0);
        Rectangle r = new Rectangle(a1, new Point(5.0, 6.0), new Point(7.0, 8.0), new Point(9.0, 10.0));
        r.setA(a2);
        assertEquals(a2, r.getA());
    }

    @Test
    public void testGetB() {
        Point b = new Point(3.0, 4.0);
        Rectangle r = new Rectangle(new Point(1.0, 2.0), b, new Point(5.0, 6.0), new Point(7.0, 8.0));
        assertEquals(b, r.getB());
    }

    @Test
    public void testSetB() {
        Point b1 = new Point(3.0, 4.0);
        Point b2 = new Point(5.0, 6.0);
        Rectangle r = new Rectangle(new Point(1.0, 2.0), b1, new Point(7.0, 8.0), new Point(9.0, 10.0));
        r.setB(b2);
        assertEquals(b2, r.getB());
    }

    @Test
    public void testGetC() {
        Point c = new Point(5.0, 6.0);
        Rectangle r = new Rectangle(new Point(1.0, 2.0), new Point(3.0, 4.0), c, new Point(7.0, 8.0));
        assertEquals(c, r.getC());
    }

    @Test
    public void testSetC() {
        Point c1 = new Point(5.0, 6.0);
        Point c2 = new Point(7.0, 8.0);
        Rectangle r = new Rectangle(new Point(1.0, 2.0), new Point(3.0, 4.0), c1, new Point(9.0, 10.0));
        r.setC(c2);
        assertEquals(c2, r.getC());
    }

    @Test
    public void testGetD() {
        Point d = new Point(7.0, 8.0);
        Rectangle r = new Rectangle(new Point(1.0, 2.0), new Point(3.0, 4.0), new Point(5.0, 6.0), d);
        assertEquals(d, r.getD());
    }

    @Test
    public void testSetD() {
        Point d1 = new Point(7.0, 8.0);
        Point d2 = new Point(9.0, 10.0);
        Rectangle r = new Rectangle(new Point(1.0, 2.0), new Point(3.0, 4.0), new Point(5.0, 6.0), d1);
        r.setD(d2);
        assertEquals(d2, r.getD());
    }
}
