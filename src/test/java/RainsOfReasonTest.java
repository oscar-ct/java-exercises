import org.junit.Assert;
import org.junit.Test;

public class RainsOfReasonTest {
    RainsOfReason rainsOfReason = new RainsOfReason();
    @Test
    public void arrayReplaceTest() {
        int[] a = {1, 2, 1, 2, 1};
        int[] aSolution =  {1, 2, 1, 2, 1};
        Assert.assertArrayEquals(aSolution, rainsOfReason.arrayReplace(a, 2, 2));
        int[] b = {1, 2, 3, 4, 5};
        int[] bSolution = {1, 2, 0, 4, 5};
        Assert.assertArrayEquals(bSolution, rainsOfReason.arrayReplace(b, 3, 0));
    }
    @Test
    public void evenDigitsOnlyTest() {
        Assert.assertTrue(rainsOfReason.evenDigitsOnly(248622));
        Assert.assertFalse(rainsOfReason.evenDigitsOnly( 7468428));
    }
    @Test
    public void variableNameTest() {
        Assert.assertTrue(rainsOfReason.variableName("var_1__Int"));
        Assert.assertFalse(rainsOfReason.variableName("qq-q"));
        Assert.assertFalse(rainsOfReason.variableName("a a_2"));
        Assert.assertTrue(rainsOfReason.variableName("_Aas_23"));
    }
    @Test
    public void chessBoardCellColorTest() {
        Assert.assertTrue(rainsOfReason.chessBoardCellColor("A1", "C3"));
        Assert.assertTrue(rainsOfReason.chessBoardCellColor("A1", "B2"));
        Assert.assertFalse(rainsOfReason.chessBoardCellColor("C3", "B5"));
        Assert.assertFalse(rainsOfReason.chessBoardCellColor("A1", "H3"));
    }
    @Test
    public void circleOFNumbersTest() {
        Assert.assertEquals(7, rainsOfReason.circleOfNumbers(10, 2));
        Assert.assertEquals(2, rainsOfReason.circleOfNumbers(10, 7));
        Assert.assertEquals(3, rainsOfReason.circleOfNumbers(4, 1));
        Assert.assertEquals(0, rainsOfReason.circleOfNumbers(6, 3));
    }
    @Test
    public void depositProfitTest() {
        Assert.assertEquals(3, rainsOfReason.depositProfit(100, 20, 170));
        Assert.assertEquals(1, rainsOfReason.depositProfit(100, 1, 101));
        Assert.assertEquals(6, rainsOfReason.depositProfit(1, 100, 64));
        Assert.assertEquals(6, rainsOfReason.depositProfit(20, 20, 50));
    }
    @Test
    public void absoluteValuesSumMinimization() {
        Assert.assertEquals(4, rainsOfReason.absoluteValuesSumMinimization(new int[]{2, 4 ,7}));
        Assert.assertEquals(1, rainsOfReason.absoluteValuesSumMinimization(new int[]{1, 1, 3, 4}));
        Assert.assertEquals(15, rainsOfReason.absoluteValuesSumMinimization(new int[]{-10, -10, -10, -10, -10, -9, -9, -9, -8, -8, -7, -6, -5, -4, -3, -2, -1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50}));
        Assert.assertEquals(0, rainsOfReason.absoluteValuesSumMinimization(new int[]{-1000000, -10000, -10000, -1000, -100, -10, -1, 0, 1, 10, 100, 1000, 10000, 100000, 1000000}));
    }

}
