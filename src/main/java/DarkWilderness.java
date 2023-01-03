public class DarkWilderness {
    public int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int a = 0, b = 0;
        while(a <= desiredHeight) {
            a += upSpeed;
            b++;
            if(a >= desiredHeight) {
                break;
            }
            a = a - downSpeed;
        }
        return b;
    }
}
