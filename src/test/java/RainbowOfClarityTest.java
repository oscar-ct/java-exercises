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
    @Test
    public void lineEncodingTest() {
        Assert.assertEquals("10a6b2c5d7e3fg2h2i23j8k5l16m9n10o18p8q6r7s11t7u41v8w15x3y63z", rainbowOfClarity.lineEncoding("aaaaaaaaaabbbbbbccdddddeeeeeeefffghhiijjjjjjjjjjjjjjjjjjjjjjjkkkkkkkklllllmmmmmmmmmmmmmmmmnnnnnnnnnooooooooooppppppppppppppppppqqqqqqqqrrrrrrssssssstttttttttttuuuuuuuvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvvwwwwwwwwxxxxxxxxxxxxxxxyyyzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz"));
        Assert.assertEquals("2bj2adlkjdl", rainbowOfClarity.lineEncoding("bbjaadlkjdl"));
        Assert.assertEquals("2a3bc", rainbowOfClarity.lineEncoding("aabbbc"));
    }
}
