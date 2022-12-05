import org.junit.Assert;
import org.junit.Test;

public class ExploringTheWaterTest {
    final ExploringTheWaters exploringTheWaters = new ExploringTheWaters();
    @Test
    public void testAlternatingSums() {
        int[] a = {50, 60, 60, 45, 70};
        int[] aSolution = {180, 105};
        int[] b = {100, 51, 50, 100};
        int[] bSolution = {150, 151};
        Assert.assertArrayEquals(aSolution, exploringTheWaters.alternatingSums(a));
        Assert.assertArrayEquals(bSolution, exploringTheWaters.alternatingSums(b));
    }
}
