import java.util.ArrayList;
import java.util.Arrays;
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

    int differentSymbolsNaive(String s) {
        String st = "";
        for (int i = 0; i < s.length(); i++) {
            if (!st.contains(Character.toString(s.charAt(i)))) {
                st += s.charAt(i);
            }
        }
        return st.length();
    }

    int arrayMaxConsecutiveSum(int[] inputArray, int k) {
        List<Integer> arrList = new ArrayList<>();
        int[] arr = Arrays.copyOfRange(inputArray, 0, k);
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        arrList.add(total);
        for (int j = 0; j < inputArray.length - k; j++) {
            total += inputArray[j + k] - inputArray[j];
            arrList.add(total);
        }
        int max = arrList.get(0);
        for (int n = 1; n < arrList.size(); n++) {
            if (arrList.get(n) > max) {
                max = arrList.get(n);
            }
        }
        return max;
    }


}
