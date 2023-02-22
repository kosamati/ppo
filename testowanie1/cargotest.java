import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CargoTest {
    @Test
    void testEquals() {
        Cargo cargo1 = new Cargo("Apples", 10);
        Cargo cargo2 = new Cargo("Apples", 10);
        Cargo cargo3 = new Cargo("Oranges", 10);
        Cargo cargo4 = new Cargo("Apples", 20);

        assertTrue(cargo1.equals(cargo2));
        assertFalse(cargo1.equals(cargo3));
        assertFalse(cargo1.equals(cargo4));
    }

    @Test
    void testHashCode() {
        Cargo cargo1 = new Cargo("Apples", 10);
        Cargo cargo2 = new Cargo("Apples", 10);

        assertEquals(cargo1.hashCode(), cargo2.hashCode());
    }

    @Test
    void testGetWeight() {
        Cargo cargo1 = new Cargo("Apples", 10);
        Cargo cargo2 = new Cargo("Oranges", 20);

        assertEquals(10, cargo1.getWeight());
        assertEquals(20, cargo2.getWeight());
    }
}
