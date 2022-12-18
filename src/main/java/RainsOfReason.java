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





}
