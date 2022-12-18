import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IslandOfKnowledgeTest {
    final IslandOfKnowledge islandOfKnowledge = new IslandOfKnowledge();
    @Test
    public void areEquallyStrongTest() {
        int[] strength = {10, 15, 15, 10};
        Assert.assertTrue(islandOfKnowledge.areEquallyStrong(strength[0], strength[1], strength[2],strength[3]));
        int[] strength2 = {15, 10, 15, 9};
        Assert.assertFalse(islandOfKnowledge.areEquallyStrong(strength2[0], strength2[1], strength2[2],strength2[3]));
    }
    @Test
    public void arrayMaximalAdjacentDifferenceTest() {
        int [] arr = {2, 4 ,1, 0};
        Assert.assertEquals(3, islandOfKnowledge.arrayMaximalAdjacentDifference(arr));
        int [] arr2 = {-1, 4 ,10, 3, -2};
        Assert.assertEquals(7, islandOfKnowledge.arrayMaximalAdjacentDifference(arr2));
    }
    @Test
    public void isIPv4AddressTest() {
        String s = "172.16.254.1";
        String s2 = "172.316.254.1";
        String s3 = "1a.254.255.0.";
        Assert.assertTrue(islandOfKnowledge.isIPv4Address(s));
        Assert.assertFalse(islandOfKnowledge.isIPv4Address(s2));
        Assert.assertFalse(islandOfKnowledge.isIPv4Address(s3));
    }
}
