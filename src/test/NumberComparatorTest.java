import org.example.NumberComparator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberComparatorTest {
    @Test
    void testFirstBigger() {
        NumberComparator nums = new NumberComparator();
        Assert.assertEquals(nums.compareNum(0, -2), 0);
    }

    @Test
    void testSecondBigger() {
        NumberComparator nums = new NumberComparator();
        Assert.assertEquals(nums.compareNum(0, 2), 2);
    }

    @Test
    void testEquals() {
        NumberComparator nums = new NumberComparator();
        Assert.assertEquals(nums.compareNum(-2, -2), -2);
    }
}
