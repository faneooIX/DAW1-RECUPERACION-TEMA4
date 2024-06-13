package rec.entornos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FraccionTest {
    @Test
    public void testMitad() {
        assertEquals(3.5, Fraccion.mitad(7), 0.01, "Mitad de 7");
        assertEquals(0.0, Fraccion.mitad(0), 0.01, "Mitad de 0");
        assertEquals(-5.0, Fraccion.mitad(-10), 0.01, "Mitad de -10");
        assertEquals(7.5, Fraccion.mitad(15), 0.01, "Mitad de 15");
    }

    @Test
    public void testTercio() {
        assertEquals(3.33,  Fraccion.tercio(10), 0.01, "Tercio de 10");
        assertEquals(0.0,   Fraccion.tercio(0), 0.01, "Tercio de 0");
        assertEquals(-3.33, Fraccion.tercio(-10), 0.01, "Tercio de -10");
        assertEquals(1.66,  Fraccion.tercio(5), 0.01, "Tercio de 5");
    }
}
