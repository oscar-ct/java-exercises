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
}
