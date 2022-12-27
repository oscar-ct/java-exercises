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


}
