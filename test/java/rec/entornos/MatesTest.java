package rec.entornos;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class MatesTest {
    @Test
    public void testValorAbsoluto() {
        assertEquals(5.0, Mates.valorAbsoluto(-5.0), "Valor absoluto de -5.0");
        assertEquals(5.0, Mates.valorAbsoluto(5.0),  "Valor absoluto de 5.0");
        assertEquals(0.0, Mates.valorAbsoluto(0.0),  "Valor absoluto de 0.0");
        assertEquals(8.3, Mates.valorAbsoluto(-8.3),  "Valor absoluto de -8.0");
    }
    @Test
    public void testFactorial() {
        assertEquals(1, Mates.factorial(0), "Factorial de 0");
        assertEquals(1, Mates.factorial(1), "Factorial de 1");
        assertEquals(2, Mates.factorial(2), "Factorial de 2");
        assertEquals(6, Mates.factorial(3), "Factorial de 3");
    }

}

