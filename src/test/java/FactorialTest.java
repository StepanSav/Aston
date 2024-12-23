import static org.junit.jupiter.api.Assertions.*;

import Main.Factorial;
import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    public void testFactorialOfZero() {
        assertEquals(1, Factorial.factorial(0), "Факториал 0 должен быть равен 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, Factorial.factorial(5), "Факториал 5 должен быть равен 120"); // 5! = 120
        assertEquals(720, Factorial.factorial(6), "Факториал 6 должен быть равен 720"); // 6! = 720
    }

    @Test
    public void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-1);
        });
        assertEquals("Число должно быть неотрицательным.", exception.getMessage());
    }
}