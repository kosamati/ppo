import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class UnitTest {

    private Unit unit;
    private Coordinates startCoordinates;
    private int maxFuel;
    private int maxCargoWeight;

    @BeforeEach
    public void setUp() {
        startCoordinates = new Coordinates(0, 0);
        maxFuel = 100;
        maxCargoWeight = 50;
        unit = new Unit(startCoordinates, maxFuel, maxCargoWeight);
    }

    @Test
    public void testMove() {
        Coordinates expectedCoordinates = new Coordinates(2, 3);
        Coordinates actualCoordinates = unit.move(2, 3);
        Assertions.assertEquals(expectedCoordinates, actualCoordinates);
        Assertions.assertEquals(95, unit.getFuel());
    }

    @Test
    public void testTankUp() {
        unit.move(2, 3);
        int fuelBefore = unit.getFuel();
        unit.tankUp();
        int fuelAfter = unit.getFuel();
        Assertions.assertTrue(fuelAfter > fuelBefore);
        Assertions.assertTrue(fuelAfter <= maxFuel);
    }

    @Test
    public void testLoadCargo() {
        Cargo cargo1 = new Cargo("Box", 10);
        Cargo cargo2 = new Cargo("Crate", 20);
        unit.loadCargo(cargo1);
        unit.loadCargo(cargo2);
        List<Cargo> expectedCargo = new ArrayList<>();
        expectedCargo.add(cargo1);
        expectedCargo.add(cargo2);
        Assertions.assertEquals(30, unit.getLoad());
    }

    @Test
    public void testLoadCargoExceedingMaxWeight() {
        Cargo cargo = new Cargo("Barrel", 60);
        Assertions.assertThrows(IllegalStateException.class, () -> unit.loadCargo(cargo));
    }

    @Test
    public void testUnloadCargo() {
        Cargo cargo = new Cargo("Box", 10);
        unit.loadCargo(cargo);
        unit.unloadCargo(cargo);
        List<Cargo> expectedCargo = new ArrayList<>();
        Assertions.assertEquals(0, unit.getLoad());
    }

    @Test
    public void testUnloadAllCargo() {
        Cargo cargo1 = new Cargo("Box", 10);
        Cargo cargo2 = new Cargo("Crate", 20);
        unit.loadCargo(cargo1);
        unit.loadCargo(cargo2);
        unit.unloadAllCargo();
        Assertions.assertEquals(0, unit.getLoad());
    }

    @Test
    public void testCalculateCargoWeight() {
        Cargo cargo1 = new Cargo("Box", 10);
        Cargo cargo2 = new Cargo("Crate", 20);
        unit.loadCargo(cargo1);
        unit.loadCargo(cargo2);
        Assertions.assertEquals(30, unit.getLoad());
    }

}
