import org.junit.Assert;
import org.junit.Test;

public class ThroughTheFogTest {
    ThroughTheFog throughTheFog = new ThroughTheFog();
    @Test
    public void circleOFNumbersTest() {
        Assert.assertEquals(7, throughTheFog.circleOfNumbers(10, 2));
        Assert.assertEquals(2, throughTheFog.circleOfNumbers(10, 7));
        Assert.assertEquals(3, throughTheFog.circleOfNumbers(4, 1));
        Assert.assertEquals(0, throughTheFog.circleOfNumbers(6, 3));
    }
    @Test
    public void depositProfitTest() {
        Assert.assertEquals(3, throughTheFog.depositProfit(100, 20, 170));
        Assert.assertEquals(1, throughTheFog.depositProfit(100, 1, 101));
        Assert.assertEquals(6, throughTheFog.depositProfit(1, 100, 64));
        Assert.assertEquals(6, throughTheFog.depositProfit(20, 20, 50));
    }
    @Test
    public void absoluteValuesSumMinimization() {
        Assert.assertEquals(4, throughTheFog.absoluteValuesSumMinimization(new int[]{2, 4 ,7}));
        Assert.assertEquals(1, throughTheFog.absoluteValuesSumMinimization(new int[]{1, 1, 3, 4}));
        Assert.assertEquals(15, throughTheFog.absoluteValuesSumMinimization(new int[]{-10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
        Assert.assertEquals(0, throughTheFog.absoluteValuesSumMinimization(new int[]{-1000000, -10000, -10000, -1000, -100, -10, -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000}));
    }
}
