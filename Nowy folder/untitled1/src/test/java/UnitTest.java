import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UnitTest {
    @Test
    void testMove() {
        Coordinates startCoordinates = new Coordinates(0, 0);
        Unit unit = new Unit(startCoordinates, 100, 100);

        Coordinates newCoordinates = unit.move(5, 10);
        assertEquals(newCoordinates, new Coordinates(5, 10));
        assertEquals(unit.getFuel(), 85);

        assertThrows(IllegalStateException.class, () -> unit.move(100, 100)); // too far
    }

    @Test
    void testTankUp() {
        Coordinates startCoordinates = new Coordinates(0, 0);
        Unit unit = new Unit(startCoordinates, 100, 100);

        int initialFuel = unit.getFuel();
        unit.tankUp();
        assertTrue(unit.getFuel() >= initialFuel);
        assertTrue(unit.getFuel() <= unit.maxFuel);
    }

    @Test
    void testLoadAndUnloadCargo() {
        Coordinates startCoordinates = new Coordinates(0, 0);
        Unit unit = new Unit(startCoordinates, 100, 100);

        Cargo cargo1 = new Cargo("Cargo 1", 10);
        Cargo cargo2 = new Cargo("Cargo 2", 20);

        assertEquals(unit.getLoad(), 0);

        unit.loadCargo(cargo1);
        assertEquals(unit.getLoad(), 10);
        assertTrue(unit.getCargo().contains(cargo1));

        unit.loadCargo(cargo2);
        assertEquals(unit.getLoad(), 30);
        assertTrue(unit.getCargo().contains(cargo2));

        assertThrows(IllegalStateException.class, () -> unit.loadCargo(new Cargo("Cargo 3", 100))); // too heavy

        unit.unloadCargo(cargo1);
        assertEquals(unit.getLoad(), 20);
        assertFalse(unit.getCargo().contains(cargo1));

        unit.unloadAllCargo();
        assertEquals(unit.getLoad(), 0);
        assertTrue(unit.getCargo().isEmpty());
    }

}
