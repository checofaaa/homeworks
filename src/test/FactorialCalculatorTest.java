import org.example.FactorialCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCalculatorTest {
    @Test
    void testFactorial() {
        FactorialCalculator calc = new FactorialCalculator();
        Assert.assertEquals(calc.calc(5), 120);
    }

    @Test
    void testFactorialZero() {
        FactorialCalculator calc = new FactorialCalculator();
        Assert.assertEquals(calc.calc(0), 1);
    }
}
