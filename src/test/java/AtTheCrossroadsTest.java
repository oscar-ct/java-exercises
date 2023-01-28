import org.junit.Assert;
import org.junit.Test;

public class AtTheCrossroadsTest {
    AtTheCrossroads atTheCrossroads = new AtTheCrossroads();
    @Test
    public void reachNextLevelTest() {
        Assert.assertTrue(atTheCrossroads.reachNextLevel(10, 15, 5));
        Assert.assertFalse(atTheCrossroads.reachNextLevel(10, 15,4));
        Assert.assertTrue(atTheCrossroads.reachNextLevel(3, 6 ,4));
    }
    @Test
    public void extraNumberTest() {
        Assert.assertEquals(7, atTheCrossroads.extraNumber(2, 7, 2));
        Assert.assertEquals(3, atTheCrossroads.extraNumber(3, 2, 2));
        Assert.assertEquals(1, atTheCrossroads.extraNumber(5, 5, 1));
        Assert.assertEquals(999, atTheCrossroads.extraNumber(99, 999, 99));
        Assert.assertEquals(3, atTheCrossroads.extraNumber(500000000, 3, 500000000));
    }
}
