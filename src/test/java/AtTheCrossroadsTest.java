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
    @Test
    public void arithmeticExpressionTest() {
        Assert.assertTrue(atTheCrossroads.arithmeticExpression(2, 3, 5));
        Assert.assertTrue(atTheCrossroads.arithmeticExpression(8, 2, 4));
        Assert.assertFalse(atTheCrossroads.arithmeticExpression(8, 3, 2));
        Assert.assertTrue(atTheCrossroads.arithmeticExpression(6, 3, 3));
        Assert.assertTrue(atTheCrossroads.arithmeticExpression(18, 2, 9));
        Assert.assertFalse(atTheCrossroads.arithmeticExpression(5, 2, 0));
    }
    @Test
    public void rangeBitCountTest() {
        Assert.assertEquals(11, atTheCrossroads.rangeBitCount(2, 7));
        Assert.assertEquals(1, atTheCrossroads.rangeBitCount(0, 1));
        Assert.assertEquals(17, atTheCrossroads.rangeBitCount(1, 10));
        Assert.assertEquals(3, atTheCrossroads.rangeBitCount(8, 9));
        Assert.assertEquals(4, atTheCrossroads.rangeBitCount(9, 10));
    }
}
