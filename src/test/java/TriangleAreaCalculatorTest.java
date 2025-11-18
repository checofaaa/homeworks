import org.example.TriangleAreaCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleAreaCalculatorTest {
    @Test
    void testArea() {
        TriangleAreaCalculator triangle = new TriangleAreaCalculator();
        Assertions.assertEquals(6, triangle.area(3, 4, 5));
    }

    @Test
    void testAreaInvalid() {
        TriangleAreaCalculator triangle = new TriangleAreaCalculator();
        double area = triangle.area(1, 2, 100);
        Assertions.assertTrue(Double.isNaN(area) || area == 0);
    }
}
