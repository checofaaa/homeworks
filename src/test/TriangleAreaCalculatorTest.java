import org.example.TriangleAreaCalculator;
import org.testng.*;
import org.testng.annotations.Test;

public class TriangleAreaCalculatorTest {
    @Test
    void testArea() {
        TriangleAreaCalculator triangle = new TriangleAreaCalculator();
        Assert.assertEquals(triangle.area(3, 4, 5), 6);
    }

    @Test
    void testAreaInvalid() {
        TriangleAreaCalculator triangle = new TriangleAreaCalculator();
        double area = triangle.area(1, 2, 100);
        Assert.assertTrue(Double.isNaN(area) || area == 0);
    }
}
