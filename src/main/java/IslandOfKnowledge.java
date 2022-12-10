import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class IslandOfKnowledge {
    public boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        int [] x = {yourLeft, yourRight};
        int [] y = {friendsLeft, friendsRight};
        Arrays.sort(x);
        Arrays.sort(y);
        return x[0] == y[0] && x[1] == y[1];
    }

    public int arrayMaximalAdjacentDifference(int[] inputArray) {
        List<Integer> s = new ArrayList<>();
        for (int i = 1; i < inputArray.length - 1; i++) {
            int n = Math.abs(inputArray[i] - inputArray[i - 1]);
            int n2 = Math.abs(inputArray[i] - inputArray[i + 1]);
            if ( n > n2) {
                s.add(n);
            } else {
                s.add(n2);
            }
        }
        Collections.sort(s);
        Collections.reverse(s);
        return s.get(0);
    }
}
