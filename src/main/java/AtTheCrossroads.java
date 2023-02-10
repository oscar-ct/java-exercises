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

    boolean arithmeticExpression(int a, int b, int c) {
        double d, e, f, g;
        d = (double) a+b;
        e = (double) a-b;
        f = (double) a*b;
        g = (double) a/b;
        double[] arr = {d, e, f, g};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == c) {
                return true;
            }
        }
        return false;
    }
    int rangeBitCount(int a, int b) {
        int c = 0;
        for (int i = a; i <= b; i++) {
            String s = Integer.toBinaryString(i);
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    c++;
                }
            }
        }
        return c;
    }
    int arrayPacking(int[] a) {
        String[] binary = new String[a.length];
        int index = 0;
        for (int i = a.length-1; i >= 0; i--) {
            binary[index++] = convertToBinary(a[i]);
        }
        String s = String.join("", binary);
        return Integer.parseInt(s,2);
    }
    // helper method to arrayPacking
    String convertToBinary(int n) {
        String s = "";
        int[] binary = new int[8];
        int index = 0;
        while(index < 8){
            binary[index++] = n % 2;
            n /= 2;
        }
        for (int i = index-1; i >= 0; i--){
            s += (binary[i]);
        }
        return s;
    }
    int mirrorBits(int a) {
        String s = Integer.toBinaryString(a), r = "";
        for (int i = s.length()-1; i >= 0; i--) {
            r += s.charAt(i);
        }
        return Integer.parseInt(r, 2);
    }
    int leastFactorial(int n) {
        int factorial = 1, count = 1;
        while(n > factorial) {
            factorial = factorial*count;
            count++;
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.println(factorial(19));
    }

    public static long factorial(int n) {
        long fac = 1;
        for (int i = 1; i <= n; i++) {
           fac = fac*i;
        }
        return fac;
    }
    int magicalWell(int a, int b, int n) {
        if (n == 0) {
            return 0;
        }
        int sum = a*b;
        for (int i = 1; i < n; i++) {
            a++;
            b++;
            sum += a*b;
        }
        return sum;
    }

}
