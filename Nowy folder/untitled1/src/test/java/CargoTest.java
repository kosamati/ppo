import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CargoTest {

    @Test
    void testCargoEquals() {
        Cargo cargo1 = new Cargo("cargo1", 10);
        Cargo cargo2 = new Cargo("cargo1", 10);
        assertEquals(cargo1, cargo2);
    }

    @Test
    void testCargoHashCode() {
        Cargo cargo1 = new Cargo("cargo1", 10);
        Cargo cargo2 = new Cargo("cargo1", 10);
        assertEquals(cargo1.hashCode(), cargo2.hashCode());
    }

}
