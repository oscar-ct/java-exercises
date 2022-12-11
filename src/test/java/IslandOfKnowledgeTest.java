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
    boolean solution(String inputString) {
        String [] charArr = inputString.split("");
        String [] numArr = inputString.split("[.]");
        List<String> acceptableNums = new ArrayList<>();
        int dotCount = 0;
        boolean invalidNumCheck = true;

        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i]);
            if (charArr[i].matches("[.]")) {
                dotCount++;
            }
        }
        for (int j = 0; j < numArr.length; j++) {
            int n = Integer.parseInt(numArr[j]);
            if (numArr[j] != "" && n <= 255 && n >= 0) {
                acceptableNums.add(numArr[j]);
            }
        }
        for (int k = 0; k < acceptableNums.size(); k++) {
            String [] arr = acceptableNums.get(k).split("");
            for (int l = 0; l < arr.length; l++) {
                if (Integer.parseInt(arr[l]) == 0 && arr.length > 1) {
                    invalidNumCheck = false;
                }
            }
        }
        System.out.println(Arrays.toString(charArr));
        System.out.println(Arrays.toString(numArr));
        System.out.println(dotCount);
        System.out.println(acceptableNums);
        return dotCount == acceptableNums.size() - 1 && acceptableNums.size() == 4 && invalidNumCheck;

    }
}
