import org.junit.Assert;
import org.junit.Test;

public class IslandOfKnowledgeTest {
    final IslandOfKnowledge islandOfKnowledge = new IslandOfKnowledge();
    @Test
    public void areEquallyStrongTest() {
        int[] strength = {10, 15, 15, 10};
        Assert.assertTrue(islandOfKnowledge.areEquallyStrong(strength[0], strength[1], strength[2],strength[3]));
        int[] strength2 = {15, 10, 15, 9};
        Assert.assertFalse(islandOfKnowledge.areEquallyStrong(strength2[0], strength2[1], strength2[2],strength2[3]));
    }
}
