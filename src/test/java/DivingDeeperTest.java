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
}
