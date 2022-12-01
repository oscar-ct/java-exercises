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

}
