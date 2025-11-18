import org.example.NumberComparator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberComparatorTest {
    @Test
    void testFirstBigger() {
        NumberComparator nums = new NumberComparator();
        Assertions.assertEquals(-2, nums.compareNum(-2, -5));
    }

    @Test
    void testSecondBigger() {
        NumberComparator nums = new NumberComparator();
        Assertions.assertEquals(0, nums.compareNum(-2, 0));
    }

    @Test
    void testEqual() {
        NumberComparator nums = new NumberComparator();
        Assertions.assertEquals(1, nums.compareNum(1, 1));
    }
}
