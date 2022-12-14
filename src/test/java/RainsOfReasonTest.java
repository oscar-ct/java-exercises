import org.junit.Assert;
import org.junit.Test;

public class ThroughTheFogTest {
    ThroughTheFog throughTheFog = new ThroughTheFog();
    @Test
    public void arrayReplaceTest() {
        int[] a = {1, 2, 1, 2, 1};
        int[] aSolution =  {1, 2, 1, 2, 1};
        Assert.assertArrayEquals(aSolution, throughTheFog.arrayReplace(a, 2, 2));
        int[] b = {1, 2, 3, 4, 5};
        int[] bSolution = {1, 2, 0, 4, 5};
        Assert.assertArrayEquals(bSolution, throughTheFog.arrayReplace(b, 3, 0));
    }
}
