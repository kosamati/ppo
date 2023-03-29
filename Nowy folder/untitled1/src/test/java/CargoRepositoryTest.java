import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class CargoRepositoryTest {

    private CargoRepository cargoRepository;

    @BeforeEach
    void setUp() {
        cargoRepository = new CargoRepository();
    }

    @Test
    void addCargo() {
        Cargo cargo = new Cargo("Test Cargo", 10);
        cargoRepository.addCargo(cargo);
        assertTrue(cargoRepository.findCargoByName("Test Cargo").isPresent());
    }

    @Test
    void removeCargo() {
        Cargo cargo = new Cargo("Test Cargo", 10);
        cargoRepository.addCargo(cargo);
        cargoRepository.removeCargo(cargo);
        assertFalse(cargoRepository.findCargoByName("Test Cargo").isPresent());
    }

    @Test
    void findCargoByName() {
        Cargo cargo1 = new Cargo("Test Cargo 1", 10);
        Cargo cargo2 = new Cargo("Test Cargo 2", 20);
        cargoRepository.addCargo(cargo1);
        cargoRepository.addCargo(cargo2);
        Optional<Cargo> foundCargo = cargoRepository.findCargoByName("Test Cargo 2");
        assertTrue(foundCargo.isPresent());
        assertEquals(cargo2, foundCargo.get());
    }

    @Test
    void findCargoByNameNotFound() {
        Optional<Cargo> foundCargo = cargoRepository.findCargoByName("Test Cargo");
        assertFalse(foundCargo.isPresent());
    }
}
