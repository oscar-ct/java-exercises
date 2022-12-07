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

    @Test
    public void testAddBorder() {
        String[] a = {"abc",
                "ded"};
        String[] aSolution = {"*****",
                "*abc*",
                "*ded*",
                "*****"};
        String[] b = {"wzy**"};
        String[] bSolution = {"*******",
                "*wzy***",
                "*******"};
        Assert.assertArrayEquals(aSolution, exploringTheWaters.addBorder(a));
        Assert.assertArrayEquals(bSolution, exploringTheWaters.addBorder(b));
    }

    @Test
    public void testAreSimilar() {
        int[] a = {1, 2, 1, 2, 2, 1};
        int[] b = {2, 2, 1, 1, 2, 1};
        int[] x = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] y = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};
        Assert.assertTrue(exploringTheWaters.areSimilar(a, b));
        Assert.assertFalse(exploringTheWaters.areSimilar(x, y));

    }
    @Test
    public void testPalindromeRearranging() {
        Assert.assertTrue(exploringTheWaters.palindromeRearranging("aabb"));
        Assert.assertTrue(exploringTheWaters.palindromeRearranging("zyyzzzzz"));
        Assert.assertFalse(exploringTheWaters.palindromeRearranging("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabc"));
        Assert.assertFalse(exploringTheWaters.palindromeRearranging("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaabbbccccaaaaaaaaaaaaa"));
    }
}
