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

}
