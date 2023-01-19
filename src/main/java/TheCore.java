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
    String reverseInParentheses(String inputString) {
        StringBuilder str = new StringBuilder(inputString);
        int start, end;
        while(str.indexOf("(") != -1){
            start = str.lastIndexOf("(");
            end = str.indexOf(")", start);
            str.replace(start, end + 1, new StringBuilder(str.substring(start+1, end)).reverse().toString());
        }
        return str.toString();
    }
}
