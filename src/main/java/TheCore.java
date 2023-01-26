public class TheCore {
    int addTwoDigits(int n) {
        String s = new String(Integer.toString(n));
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            int num = Integer.parseInt(Character.toString(s.charAt(i)));
            sum += num;
        }
        return sum;
    }
//    int addTwoDigits(int n) {
//        return n/10 + n%10;
//    }
    int largestNumber(int n) {
        String s = "";
        while (s.length() < n) {
            s += 9;
        }
        return Integer.parseInt(s);
    }
//    int largestNumber(int n) {
//        return (int)Math.pow(10,n) - 1;
//    }
    int candies(int n, int m) {
        return n * Math.floorDiv(m, n);
    }
//    int candies(int n, int m) {
//        return m - m%n;
//    }
    int lateRide(int n) {
        int hr = 1, min = 0, c = 0, sol = 0;
        while (60*hr <= n) {
            hr++;
        }
        hr--;
        c = hr*60;
        min = n-c;
        String s = "" + hr + min;
        for (int i = 0; i < s.length(); i++) {
            sol += Integer.parseInt(Character.toString(s.charAt(i)));
        }
        return sol;
    }
//    int lateRide(int n) {
//        int hours = n/60;
//        int minutes = n%60;
//        return hours/10 + hours%10 + minutes/10 + minutes%10;
//    }
    int phoneCall(int min1, int min2_10, int min11, int s) {
        int sum = min1, min2count = 0, min11count = 0;
        if (min1 == s) {
            return 1;
        } else if (s < min1) {
            return 0;
        }
        while (s >= sum && min2count < 9) {
            sum += min2_10;
            if (s >= sum) {
                min2count++;
            }
        }
        if (sum < s) {
            for (int i = sum; i <= s; i += min11) {
                min11count++;
            }
            min11count--;
        }
        return min2count + min11count + 1;
    }
//    int phoneCall(int min1, int min2_10, int min11, int s) {
//        int m;
//        for (m = 1; s >= 0; m++) s -= m == 1 ? min1 : m <= 10 ? min2_10 : min11;
//        return m - 2;
//    }

}
