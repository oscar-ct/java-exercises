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
}
