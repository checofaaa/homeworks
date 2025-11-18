import org.example.ArithmeticCalculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ArithmeticCalculatorTest {
    @Test
    public void testAdd() {
        ArithmeticCalculator calc = new ArithmeticCalculator();
        Assert.assertEquals(calc.add(3, 4), 7);
    }

    @Test
    public void testDiv() {
        ArithmeticCalculator calc = new ArithmeticCalculator();
        Assert.assertEquals(calc.div(10, 5), 2);
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void testDivByZero() {
        ArithmeticCalculator calc = new ArithmeticCalculator();
        calc.div(10, 0);
    }
}
