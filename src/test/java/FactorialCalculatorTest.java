import org.example.FactorialCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactorialCalculatorTest {
    @Test
    void testFactorial() {
        FactorialCalculator factorial = new FactorialCalculator();
        Assertions.assertEquals(6, factorial.calc(3));
    }

    @Test
    void testFactorialZero() {
        FactorialCalculator factorial = new FactorialCalculator();
        Assertions.assertEquals(1, factorial.calc(0));
    }
}
