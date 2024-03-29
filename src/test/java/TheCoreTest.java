import org.junit.Assert;
import org.junit.Test;

public class TheCoreTest {
    TheCore theCore = new TheCore();
    @Test
    public void addTwoDigitsTest() {
        Assert.assertEquals(81, theCore.addTwoDigits(999999999));
        Assert.assertEquals(15, theCore.addTwoDigits(915));
        Assert.assertEquals(8, theCore.addTwoDigits(26));
    }
    @Test
    public void largestNumberTest() {
        Assert.assertEquals(9999999, theCore.largestNumber(7));
        Assert.assertEquals(99999999, theCore.largestNumber(8));
        Assert.assertEquals(9, theCore.largestNumber(1));
    }
    @Test
    public void candiesTest() {
        Assert.assertEquals(9, theCore.candies(3, 10));
        Assert.assertEquals(2, theCore.candies(1, 2));
        Assert.assertEquals(0, theCore.candies(10, 5));
        Assert.assertEquals(4, theCore.candies(4, 4));
        Assert.assertEquals(12, theCore.candies(4, 15));
        Assert.assertEquals(99, theCore.candies(9, 100));
    }
    @Test
    public void lateRideTest() {
        Assert.assertEquals(4, theCore.lateRide(240));
        Assert.assertEquals(14, theCore.lateRide(808));
        Assert.assertEquals(19, theCore.lateRide(1439));
        Assert.assertEquals(0, theCore.lateRide(0));
        Assert.assertEquals(5, theCore.lateRide(23));
        Assert.assertEquals(8, theCore.lateRide(8));
    }
    @Test
    public void phoneCallTest() {
        Assert.assertEquals(14, theCore.phoneCall(3, 1, 2, 20));
        Assert.assertEquals(1, theCore.phoneCall(2, 2, 1, 2));
        Assert.assertEquals(11, theCore.phoneCall(10, 1, 2, 22));
        Assert.assertEquals(14, theCore.phoneCall(2, 2, 1, 24));
        Assert.assertEquals(3, theCore.phoneCall(1, 2, 1, 6));
        Assert.assertEquals(0, theCore.phoneCall(10, 10, 10, 8));
    }
}
