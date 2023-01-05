public class DarkWilderness {
    public int growingPlant(int upSpeed, int downSpeed, int desiredHeight) {
        int a = 0, b = 0;
        while(a <= desiredHeight) {
            a += upSpeed;
            b++;
            if(a >= desiredHeight) {
                break;
            }
            a = a - downSpeed;
        }
        return b;
    }
    public int knapsackLight(int value1, int weight1, int value2, int weight2, int maxW) {
        boolean bothValuesUnderMaxW = false, singleValueUnderMaxW = false, sumValuesUnderMaxW = false;
        if (weight1 + weight2 <= maxW) {
            sumValuesUnderMaxW = true;
        } else if (weight1 <= maxW && weight2 <= maxW) {
            bothValuesUnderMaxW = true;
        } else if (weight1 <= maxW || weight2 <= maxW) {
            singleValueUnderMaxW = true;
        }
        if (singleValueUnderMaxW) {
            if (weight1 <= maxW) {
                return value1;
            } else {
                return value2;
            }
        }
        if (bothValuesUnderMaxW) {
            return Math.max(value1, value2);
        }
        if (sumValuesUnderMaxW) {
            return value1 + value2;
        }
        return 0;
    }
    String longestDigitsPrefix(String inputString) {
        String s = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isAlphabetic(inputString.charAt(i)) || Character.isWhitespace(inputString.charAt(i))) {
                break;
            }
            System.out.println(inputString.charAt(i));
            s += inputString.charAt(i);
        }
        return s;
    }

}
