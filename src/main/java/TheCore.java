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
}
