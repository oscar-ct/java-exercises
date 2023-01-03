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
}
