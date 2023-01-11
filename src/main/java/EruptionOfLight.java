import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EruptionOfLight {
    public String findEmailDomain(String address) {
        String[] s = address.split("@");
        return s[s.length - 1];
    }
    String buildPalindrome(String st) {
        String sb = "";
        for (int i = st.length() - 1; i >= 0; i--) {
            sb += st.charAt(i);
        }
        if (st.equals(sb)) {
            return st;
        }
        List<String> palindromes = new ArrayList<>();
        String[] sbArr = sb.split("");
        for (int j = 0; j < sbArr.length; j++) {
            String str = st;
            String strReverse = "";
            String[] tempStr = Arrays.copyOfRange(sbArr, j, sbArr.length);
            for (int k = 0; k < tempStr.length; k++) {
                str += tempStr[k];
            }
            for (int l = str.length() - 1; l >= 0; l--) {
                strReverse += str.charAt(l);
            }
            if (str.equals(strReverse)) {
                palindromes.add(str);
            }
        }
        String smallest = palindromes.get(0);
        for (int m = 1; m < palindromes.size(); m++) {
            if (palindromes.get(m).length() < smallest.length()) {
                smallest = palindromes.get(m);
            }
        }
        return smallest;
    }
    boolean isMAC48Address(String inputString) {
        String l = "ABCDEF", n = "0123456789";
        int c = 0, h = 0;
        String[] arr = inputString.split("-");
        System.out.println(Arrays.toString(arr));
        for (int k = 0; k < inputString.length(); k++) {
            if (inputString.charAt(k) == '-') {
                h++;
            }
        }
        if (arr.length != 6 || h != 5) {
            return false;
        }
        for (int i = 0; i < arr.length; i++) {
            String[] s = arr[i].split("");
            for (int j = 0; j < s.length - 1; j++) {
                if (l.contains(s[j]) && n.contains(s[j+1])) {
                    c++;
                } else if (l.contains(s[j + 1]) && n.contains(s[j])) {
                    c++;
                } else if (n.contains(s[j]) && n.contains(s[j+1])) {
                    c++;
                } else if (l.contains(s[j+1]) && l.contains(s[j])) {
                    c++;
                }
            }
        }
        return c == 6;
    }
    int solution(int[] votes, int k) {
        // List<int[]> arr = new ArrayList<>();
        // int[][] arrays = new int[votes.length][votes.length];
        // System.out.println(Arrays.toString(arrays));
        Arrays.sort(votes);
        System.out.println(Arrays.toString(votes));
        int[] tempArr = votes;
        String s = "";
        for (int i = 0; i < votes.length; i++) {
            tempArr[i] = (tempArr[i] + k);
            System.out.println(Arrays.toString(tempArr));
            for (int x = 0; x < tempArr.length; x++) {
                s += tempArr[x];
            }
            // arrays[i] = tempArr;
            // arr.add(tempArr);
            tempArr[i] = (tempArr[i] - k);
            // System.out.println(Arrays.toString(tempArr));
        }
        System.out.println(s);
        String[] n = s.split("");
        Arrays.sort(n);
        String sr = "";
        System.out.println(Arrays.toString(n));
        for (int l = n.length - 1; l >= 0; l--) {
            sr += n[l];
        }
        System.out.println(sr);
        int count = 0;
        for (int y = 0; y < sr.length() - 1; y++) {
            if (Integer.parseInt(Character.toString(sr.charAt(y))) > Integer.parseInt(Character.toString(sr.charAt(y + 1)))) {
                count++;
            }
        }
        // for (int j = 0; j < arrays.length; j++) {
        //     System.out.println(Arrays.toString(arrays[j]));
        // }
        // for (int d = 0; d < arrays.length; d++) {
        //     System.out.println((Arrays.toString(arr.get(d))));
        // }

        return count;
    }

}
