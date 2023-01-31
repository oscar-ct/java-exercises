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
//    int extraNumber (int a, int b, int c) {
//        return a^b^c;
//    }

    //  Given integers a and b, determine whether the following pseudocode results in an infinite loop
    //  while a is not equal to b do
    //  increase a by 1
    //  decrease b by 1
    boolean isInfiniteProcess(int a, int b) {
        return !(b>=a && (b-a)%2==0);
    }
    //  this is a solution to a challenge I could not figure out.  I had to google the solution to this. Credit to user mssk.
    // leaving this here for future reference
}
