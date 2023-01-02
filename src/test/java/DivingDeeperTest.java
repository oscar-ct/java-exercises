import org.junit.Assert;
import org.junit.Test;

public class DivingDeeperTest {
    DivingDeeper divingDeeper = new DivingDeeper();
    @Test
    public void extractEachKthTest() {
        Assert.assertArrayEquals(new int[]{1, 2, 4, 5, 7, 8, 10}, divingDeeper.extractEachKth(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 3));
        Assert.assertArrayEquals(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, divingDeeper.extractEachKth(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, 10));
        Assert.assertArrayEquals(new int[]{1, 1, 1, 1}, divingDeeper.extractEachKth(new int[]{1, 2, 1, 2, 1, 2, 1, 2}, 2));
    }
    @Test
    public void firstDigitTest() {
        Assert.assertEquals('1', divingDeeper.firstDigit("var_1__Int"));
        Assert.assertEquals('9', divingDeeper.firstDigit( "a a_933"));
        Assert.assertEquals('7', divingDeeper.firstDigit( "a sjkndvjkdnvkjd fvjknjk kjf vkj fg7_933"));
    }
    @Test
    public void differentSymbolsNaiveTest() {
        Assert.assertEquals(26, divingDeeper.differentSymbolsNaive("abcdefghijklmnopqrstuvwxyz"));
        Assert.assertEquals(2, divingDeeper.differentSymbolsNaive("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaazzzzzzzz"));
        Assert.assertEquals(3, divingDeeper.differentSymbolsNaive("abccccccc"));
    }
}
