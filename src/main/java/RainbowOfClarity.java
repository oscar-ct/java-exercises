import java.util.ArrayList;
import java.util.Arrays;

public class RainbowOfClarity {
    boolean isDigit(char symbol) {
        return Character.isDigit(symbol);
    }
    String lineEncoding(String s) {
        s += '!';
        String ns = "";
        int count = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)) {
                count++;
            } else {
                if (count > 1) {
                    ns += Integer.toString(count) + s.charAt(i);
                } else {
                    ns += s.charAt(i);
                }
                count = 1;
            }
        }
        return ns;
    }
    String longestWord(String text) {
        ArrayList<String> arrList = new ArrayList<>();
        String[] arr = text.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            String n = "";
            for (int y = 0; y < arr[i].length(); y++) {
                if (Character.isAlphabetic(s.charAt(y))) {
                    n += s.charAt(y);
                }
            }
            arrList.add(n);
        }
        String longestWord = "";
        int max = 0;
        for (int j = 0; j < arrList.size(); j++) {
            if (arrList.get(j).length() > max) {
                max = arrList.get(j).length();
                longestWord = arrList.get(j);
            }
        }
        return longestWord;
    }
}
