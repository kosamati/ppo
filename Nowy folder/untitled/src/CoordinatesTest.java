
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CoordinatesTest {
    @Test
void testCoordinatesConstructor() {
    // Testowanie tworzenia obiektu klasy Coordinates
    Coordinates coordinates = new Coordinates(50, 75);
    Assertions.assertEquals(50, coordinates.getX());
    Assertions.assertEquals(75, coordinates.getY());
}

@Test
void testCoordinatesCopy() {
    // Testowanie tworzenia kopii obiektu klasy Coordinates
    Coordinates coordinates = new Coordinates(50, 75);
    Coordinates copy = Coordinates.copy(coordinates, 10, 20);
    Assertions.assertEquals(60, copy.getX());
    Assertions.assertEquals(95, copy.getY());
}

@Test
void testEquals() {
    // Testowanie metody equals()
    Coordinates coordinates1 = new Coordinates(50, 75);
    Coordinates coordinates2 = new Coordinates(50, 75);
    Coordinates coordinates3 = new Coordinates(60, 95);
    Assertions.assertEquals(coordinates1, coordinates2);
    Assertions.assertNotEquals(coordinates1, coordinates3);
}

@Test
void testHashCode() {
    // Testowanie metody hashCode()
    Coordinates coordinates1 = new Coordinates(50, 75);
    Coordinates coordinates2 = new Coordinates(50, 75);
    Coordinates coordinates3 = new Coordinates(60, 95);
    Assertions.assertEquals(coordinates1.hashCode(), coordinates2.hashCode());
    Assertions.assertNotEquals(coordinates1.hashCode(), coordinates3.hashCode());
}

@Test
void testIllegalArgumentException() {
    // Testowanie wyjątku IllegalArgumentException
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Coordinates(-1, 50));
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Coordinates(50, -1));
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Coordinates(101, 50));
    Assertions.assertThrows(IllegalArgumentException.class, () -> new Coordinates(50, 101));
}
}