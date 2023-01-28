public class AtTheCrossroads {
    boolean reachNextLevel(int experience, int threshold, int reward) {
        return threshold <= experience+reward;
    }
    int extraNumber(int a, int b, int c) {
        if (a == b) {
            return c;
        }
        if (a == c) {
            return b;
        }
        return a;
    }
}
