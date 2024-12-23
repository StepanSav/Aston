import Main.Factorial;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {
    @Test
    public void testFactorialOfZero() {
        Assert.assertEquals(Factorial.factorial(0), 1, "Факториал 0 должен быть равен 1");
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        Assert.assertEquals(Factorial.factorial(5), 120, "Факториал 5 должен быть равен 120"); // 5! = 120
        Assert.assertEquals(Factorial.factorial(6), 720, "Факториал 6 должен быть равен 720"); // 6! = 720
    }

    @Test(expectedExceptions = IllegalArgumentException.class,
            expectedExceptionsMessageRegExp = "Число должно быть неотрицательным.")
    public void testFactorialOfNegativeNumber() {
        Factorial.factorial(-1);
    }
}