import org.junit.Assert;
import org.junit.Test;

public class RainbowOfClarityTest {
    RainbowOfClarity rainbowOfClarity = new RainbowOfClarity();
    @Test
    public void isDigitTest() {
        Assert.assertTrue(rainbowOfClarity.isDigit('9'));
        Assert.assertTrue(rainbowOfClarity.isDigit('0'));
        Assert.assertFalse(rainbowOfClarity.isDigit('-'));
        Assert.assertFalse(rainbowOfClarity.isDigit('O'));
    }
}
