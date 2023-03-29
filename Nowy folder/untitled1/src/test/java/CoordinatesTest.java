import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
class CoordinatesTest{
    @Test
    void testConstructor() {
        Coordinates coordinates = new Coordinates(50, 75);
        Assertions.assertEquals(50, coordinates.getX());
        Assertions.assertEquals(75, coordinates.getY());
    }

    @Test
    void testCopy() {
        Coordinates coordinates = new Coordinates(50, 75);
        Coordinates copiedCoordinates = Coordinates.copy(coordinates, 10, 20);
        Assertions.assertEquals(60, copiedCoordinates.getX());
        Assertions.assertEquals(95, copiedCoordinates.getY());
    }

    @Test
    void testEqualsAndHashCode() {
        Coordinates coordinates1 = new Coordinates(50, 75);
        Coordinates coordinates2 = new Coordinates(50, 75);
        Coordinates coordinates3 = new Coordinates(60, 95);

        Assertions.assertEquals(coordinates1, coordinates2);
        Assertions.assertEquals(coordinates1.hashCode(), coordinates2.hashCode());

        Assertions.assertNotEquals(coordinates1, coordinates3);
        Assertions.assertNotEquals(coordinates1.hashCode(), coordinates3.hashCode());
    }

    @Test
    void testConstructorWithNegativeValues() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Coordinates(-1, 50));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Coordinates(50, -1));
    }

    @Test
    void testConstructorWithValueMoreThan100() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Coordinates(101, 50));
        Assertions.assertThrows(IllegalArgumentException.class, () -> new Coordinates(50, 101));
    }
}

