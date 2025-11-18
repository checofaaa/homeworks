import org.example.ArithmeticCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArithmeticCalculatorTest {
    @Test
    void testAdd() {
        ArithmeticCalculator calc = new ArithmeticCalculator();
        Assertions.assertEquals(4, calc.add(1, 3));
    }

    @Test
    void testSub() {
        ArithmeticCalculator calc = new ArithmeticCalculator();
        Assertions.assertEquals(-2, calc.sub(6, -8));
    }

    @Test
    void testMul() {
        ArithmeticCalculator calc = new ArithmeticCalculator();
        Assertions.assertEquals(0, calc.mul(0, 3));
    }

    @Test
    void testDiv() {
        ArithmeticCalculator calc = new ArithmeticCalculator();
        Assertions.assertEquals(0.5, calc.div(-4, -8));
    }

    @Test
    void testDivByZero() {
        ArithmeticCalculator calc = new ArithmeticCalculator();
        Assertions.assertThrows(ArithmeticException.class, () -> calc.div(5, 0));
    }
}
