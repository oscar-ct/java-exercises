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

}
