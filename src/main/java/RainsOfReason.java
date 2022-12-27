public class RainsOfReason {

    public int[] arrayReplace(int[] inputArray, int elemToReplace, int substitutionElem) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == elemToReplace) {
                inputArray[i] = substitutionElem;
            }
        }
        return inputArray;
    }
    boolean evenDigitsOnly(int n) {
        String s = "" + n;
        int evenCount = 0;
        for (int i = 0; i < s.length(); i++) {
            String ch = Character.toString(s.charAt(i));
            int num = Integer.parseInt(ch);
            if (num % 2 != 0) {
                evenCount++;
            }
        }
        return evenCount == 0;
    }

    boolean variableName(String name) {
        String ch = Character.toString(name.charAt(0));
        if (Utils.isNumeric(ch)) {
            return false;
        }
        String lcName = name.toLowerCase();
        String validChars = "abcdefghijklmnopqrstuvwxyz0123456789_";
        int count = 0;
        for (int i = 0; i < lcName.length(); i++) {
            if (!validChars.contains(Character.toString(lcName.charAt(i)))) {
                count++;
            }
        }
        return count == 0;
    }

    boolean chessBoardCellColor(String cell1, String cell2) {
        String board = "ABCDEFGH";
        String dark = "";
        String light = "";
        for (int i = 0; i < board.length(); i++) {
            char ch = board.charAt(i);
            for (int j = 1; j < 9; j++) {
                String s = Integer.toString(j);
                if (ch == 'A' || ch == 'C' || ch == 'E' || ch == 'G') {
                    if (j % 2 != 0) {
                        dark += ch + s;
                    } else {
                        light += ch + s;
                    }
                } else {
                    if (j % 2 == 0) {
                        dark += ch + s;
                    } else {
                        light += ch + s;
                    }
                }
            }
        }
        return light.contains(cell1) && light.contains(cell2) || dark.contains(cell1) && dark.contains(cell2);
    }

    int circleOfNumbers(int n, int firstNumber) {
        return (n/2 + firstNumber) % n;
    }

    int depositProfit(int deposit, int rate, int threshold) {
        int total = deposit;
        int count = 0;
        while (total < threshold) {
            double amount = (double)rate / 100 * total;
            total += amount;
            count++;
        }
        return count;
    }

    int absoluteValuesSumMinimization(int[] a) {
        int[] arr = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            int total = 0;
            for (int j = 0; j < a.length; j++) {
                total += Math.abs(a[i] - a[j]);
            }
            arr[i] = total;
        }
        int min = arr[0];
        for (int k = 1; k < arr.length; k++) {
            if (arr[k] < min) {
                min = arr[k];
            }
        }
        int index = 0;
        for (int l = 0; l < arr.length; l++) {
            if (arr[l] == min) {
                index = l;
                break;
            }
        }
        return a[index];
    }



}
