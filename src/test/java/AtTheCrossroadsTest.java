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
    @Test
    public void arrayPackingTest() {
        Assert.assertEquals(21784, atTheCrossroads.arrayPacking(new int[] {24, 85, 0}));
        Assert.assertEquals(2567447, atTheCrossroads.arrayPacking(new int[] {23, 45, 39}));
        Assert.assertEquals(134480385, atTheCrossroads.arrayPacking(new int[] {1, 2, 4, 8}));
        Assert.assertEquals(724198331, atTheCrossroads.arrayPacking(new int[] {187, 99, 42, 43}));
    }
    @Test
    public void mirrorBitsTest() {
        Assert.assertEquals(67, atTheCrossroads.mirrorBits(97));
        Assert.assertEquals(1, atTheCrossroads.mirrorBits(8));
        Assert.assertEquals(111, atTheCrossroads.mirrorBits(123));
        Assert.assertEquals(65173, atTheCrossroads.mirrorBits(86782));
        Assert.assertEquals(5, atTheCrossroads.mirrorBits(5));
    }
    @Test
    public void leastFactorialTest() {
        Assert.assertEquals(1, atTheCrossroads.leastFactorial(1));
        Assert.assertEquals(6, atTheCrossroads.leastFactorial(5));
        Assert.assertEquals(24, atTheCrossroads.leastFactorial(14));
        Assert.assertEquals(120, atTheCrossroads.leastFactorial(111));
    }
    @Test
    public void magicalWellTest() {
        Assert.assertEquals(8, atTheCrossroads.magicalWell(1, 2 ,2));
        Assert.assertEquals(1, atTheCrossroads.magicalWell(1, 1 ,1));
        Assert.assertEquals(128, atTheCrossroads.magicalWell(6, 5 ,3));
        Assert.assertEquals(0, atTheCrossroads.magicalWell(1601, 337 ,0));
    }
}
