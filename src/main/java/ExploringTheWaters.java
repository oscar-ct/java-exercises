import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class ExploringTheWaters {
    public int[] alternatingSums(int[] a) {
        int sum = 0;
        int sum2 = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                sum += a[i];
            } else {
                sum2 += a[i];
            }
        }
        return new int[]{sum, sum2};
    }

    public String[] addBorder(String[] picture) {
        List<String> list = new LinkedList<>();
        for (int i = 0; i < picture.length; i++) {
            picture[i] = "*" + picture[i] + "*";
            list.add(picture[i]);
        }
        String s = new String();
        for (int j = 0; j < picture[0].length(); j++) {
            s += "*";
        }
        list.add(0, s);
        list.add(picture.length + 1, s);
        System.out.println(list);
        return list.toArray(String[]::new);
    }

    public boolean areSimilar(int[] a, int[] b) {
        int count = 0;
        int sum = 1;
        int sum2 = 1;
        for (int i = 0; i < b.length; i++) {
            if (a[i] != b[i]) {
                count++;
                sum *= a[i];
                sum2 *= b[i];
            }
        }
        return count < 3 && sum == sum2;
    }

    public boolean palindromeRearranging(String inputString) {
        List<Character> s = new ArrayList<>();
        // extracts single unique char from inputString into arrList
        for (int i = 0; i < inputString.length(); i++) {
            if(!s.contains(inputString.charAt(i))) {
                s.add(inputString.charAt(i));
            }
        }
        // new arr with total num of char occurrences
        int[] charCount = new int[s.size()];
        for (int j = 0; j < s.size(); j++) {
            int count = 0;
            for (int k = 0; k < inputString.length(); k++) {
                if (s.get(j) == inputString.charAt(k)) {
                    count++;
                }
            }
            charCount[j] = count;
        }
        // find num of the char odd occurrences
        int oddCount = 0;
        for (int l = 0; l < charCount.length; l++) {
            if (charCount[l] % 2 != 0) {
                oddCount++;
            }
        }
        return oddCount <= 1;
    }


}
