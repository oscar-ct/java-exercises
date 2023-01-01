import java.util.ArrayList;
import java.util.List;

public class DivingDeeper {
    int[] extractEachKth(int[] inputArray, int k) {
        List<Integer> arr = new ArrayList<>();
        for (int i = 0; i < inputArray.length; i++) {
            if ((i+1) % k != 0) {
                arr.add(inputArray[i]);
            }
        }
        int[] a = new int[arr.size()];
        for (int j = 0; j < arr.size(); j++) {
            a[j] = arr.get(j);
        }
        return a;
    }

    char firstDigit(String inputString) {
        char ch = 'a';
        for (int i = 0; i < inputString.length(); i++) {
            if(Character.isDigit(inputString.charAt(i))) {
                ch = inputString.charAt(i);
                break;
            }
        }
        return ch;
    }

}
