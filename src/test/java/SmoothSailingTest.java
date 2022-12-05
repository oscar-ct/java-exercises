import org.junit.Assert;
import org.junit.Test;

public class SmoothSailingTest {

    final SmoothSailing smoothSailing = new SmoothSailing();

    @Test
    public void testAllLongestStrings() {
        String[] inputArray = {"aba","aa","ad","vcd","aba"};
        String[] answer = {"aba","vcd","aba"};
        String[] inputArray2 = {"abc","eeee","abcd","dcd"};
        String[] answer2 = {"eeee","abcd"};
        Assert.assertArrayEquals(answer, smoothSailing.allLongestStrings(inputArray));
        Assert.assertArrayEquals(answer2, smoothSailing.allLongestStrings(inputArray2));
    }

    @Test
    public void testCommonCharacterCount() {
        String s1 = "abcdefghijklmnopqrstuvwxyz";
        String s2 = "zyxwvutsrqponmlkjihgfedcba";
        Assert.assertEquals(26, smoothSailing.commonCharacterCount(s1, s2));
    }

    @Test
    public void testIsLucky() {
        int n = 123321;
        int m = 238017000;
        Assert.assertTrue(smoothSailing.isLucky(n));
        Assert.assertFalse(smoothSailing.isLucky(m));
    }

    @Test
    public void testSortByHeight() {
        int[] a = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] aSolution = {-1, 150, 160, 170, -1, -1, 180, 190};
        int[] b = {23, 54, -1, 43, 1, -1, -1, 77, -1, -1, -1, 3};
        int[] bSolution = {1, 3, -1, 23, 43, -1, -1, 54, -1, -1, -1, 77};
        Assert.assertArrayEquals(aSolution, smoothSailing.sortByHeight(a));
        Assert.assertArrayEquals(bSolution, smoothSailing.sortByHeight(b));
    }

}
