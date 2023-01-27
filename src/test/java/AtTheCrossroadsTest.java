import org.junit.Assert;
import org.junit.Test;

public class AtTheCrossroadsTest {
    AtTheCrossroads atTheCrossroads = new AtTheCrossroads();
    @Test
    public void reachNextLevelTest() {
        Assert.assertTrue(atTheCrossroads.reachNextLevel(10, 15, 5));
        Assert.assertFalse(atTheCrossroads.reachNextLevel(10, 15,4));
        Assert.assertTrue(atTheCrossroads.reachNextLevel(3, 6 ,4));
    }
}
