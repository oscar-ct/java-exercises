import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SmoothSailing {
    public String [] allLongestStrings(String[] inputArray) {
        final List<String> newStrList = new ArrayList<>();
        int maxLength = 0;

        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i].length() > maxLength) {
                maxLength = inputArray[i].length();
            }
        }
        for (int j = 0; j < inputArray.length; j++) {
            if (inputArray[j].length() == maxLength) {
                newStrList.add(inputArray[j]);
            }
        }
        return newStrList.toArray(String[]::new);
    }


    public int commonCharacterCount(String s1, String s2) {
        int maxMatch = 0;
        for (int i = 0; i < s1.length(); i++) {
            String s = Character.toString(s1.charAt(i));
            if (s2.contains(s)) {
                System.out.println(s2);
                maxMatch++;
                s2 = s2.replaceFirst(s, "");
            }
        }
        return maxMatch;
    }

    public boolean isLucky(int n) {
        int sum = 0;
        int sum2 = 0;
        String str = Integer.toString(n);
        int strLen = str.length();

        for (int i = 0; i < strLen/2; i++) {
            String s = Character.toString(str.charAt(i));
            String s2 = Character.toString(str.charAt(i + strLen/2));
            int num = Integer.parseInt(s);
            int num2 = Integer.parseInt(s2);
            sum += num;
            sum2 += num2;
        }
        return sum == sum2;
    }

    public int[] sortByHeight(int[] a) {
        List<Integer> aLink = new LinkedList<>();
        List<Integer> treeIndex = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == -1) {
                treeIndex.add(i);
            } else {
                aLink.add(a[i]);
            }
        }
        Collections.sort(aLink);
        for (int j = 0; j < aLink.size(); j++) {
            for (int k = 0; k < treeIndex.size(); k++) {
                if (j == treeIndex.get(k)) {
                    aLink.add(j, -1);
                }
            }
            a[j] = aLink.get(j);
        }
        return a;
    }


    public String reverseInParentheses(String inputString) {
        return inputString;
    }


}











