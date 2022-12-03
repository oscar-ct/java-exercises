import java.util.ArrayList;
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
}









