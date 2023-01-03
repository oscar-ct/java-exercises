import org.junit.Assert;
import org.junit.Test;

public class DarkWildernessTest {
    DarkWilderness darkWilderness = new DarkWilderness();
    @Test
    public void growingPlantTest() {
        Assert.assertEquals(10, darkWilderness.growingPlant(100, 10, 910));
        Assert.assertEquals(1, darkWilderness.growingPlant(10, 9, 4));
        Assert.assertEquals(2, darkWilderness.growingPlant(5, 2, 7));
    }
    @Test
    public void knapsackLightTest() {
        Assert.assertEquals(3, darkWilderness.knapsackLight(3, 5,3,8,10));
        Assert.assertEquals(4, darkWilderness.knapsackLight(4, 3,3,4,4));
        Assert.assertEquals(0, darkWilderness.knapsackLight(10, 2,11,3,1));
    }
}
