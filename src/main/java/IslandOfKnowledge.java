import java.util.Arrays;

public class IslandOfKnowledge {
    public boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {
        int [] x = {yourLeft, yourRight};
        int [] y = {friendsLeft, friendsRight};
        Arrays.sort(x);
        Arrays.sort(y);
        return x[0] == y[0] && x[1] == y[1];
    }
}
