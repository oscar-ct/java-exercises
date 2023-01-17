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
}
