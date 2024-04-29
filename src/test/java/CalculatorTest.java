import org.example.Calculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private Calculator calc = new Calculator();

    @Test
    void testAdd(){
        assertEquals(10, calc.add(5, 5), "5 + 5 should be 10");
    }

    @Test
    void testDivide(){
        Exception e = assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(3, 0);
        });
        assertEquals("Divider cannot be zero", e.getMessage());
    }
}
