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
    int appleBoxes(int k) {
        int y = 0, r = 0;
        for (int i = 0; i <= k; i++) {
            if (i % 2 == 0) {
                int e = i*i;
                r += e;
                e = 0;
            } else {
                System.out.println(i);
                int o = i*i;
                y += o;
                o = 0;
            }
        }
        return r-y;
    }
    int rounders(int n) {
        String s = "";
        int[] a = new int[Integer.toString(n).length()];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(Character.toString(Integer.toString(n).charAt(i)));
        }
        for (int j = a.length-1; j >= 1; j--) {
            if (a[j] >= 5) {
                a[j] = 0;
                a[j-1] = a[j-1] + 1;
            } else {
                a[j] = 0;
            }
        }
        for (int k = 0; k < a.length; k++) {
            s += a[k];
        }
        return Integer.parseInt(s);
    }
    int[] createArray(int size) {
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = 1;
        }
        return a;
    }
    int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace) {
                inputArray[i] = substitutionElem;
            }
        }
        return inputArray;
    }
    int[] firstReverseTry(int[] arr) {
        int[] l = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            l[i] = arr[i];
        }
        for (int j = 0; j < l.length; j++) {
            if (j == 0) {
                arr[j] = l[l.length-1];
            } else if (j == l.length-1) {
                arr[l.length-1] = l[0];
            }
        }
        return arr;
    }




}
