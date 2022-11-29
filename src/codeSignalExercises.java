import java.util.ArrayList;
import java.util.Collections;

public class codeSignalExercises {

    public static boolean checkPalindrome (String inputString) {
        StringBuilder newStrBuilder = new StringBuilder();
        newStrBuilder.append(inputString).reverse();
//        String newStr = "";
//        newStr = newStr + ch;
        StringBuilder newStr = new StringBuilder();
        char ch;
        for (int i = 0; i < newStrBuilder.length(); i++) {
            ch = newStrBuilder.charAt(i);
            newStr.append(ch);
        }
        System.out.println(newStr);
        return newStr.toString().equals(inputString);
//        return inputString.equals(new StringBuilder(inputString).reverse().toString());
    }

    public static int adjacentElementsProduct (int [] inputArray) {
        ArrayList<Integer> numList = new ArrayList<>();
        for (int i = 0; i < inputArray.length - 1; i++) {
            numList.add(inputArray[i] * inputArray[i + 1]);
        }
//        int maximum = numList.get(0);
//        for (int i = 1; i < numList.size(); i++) {
//            if (maximum < numList.get(i))
//                maximum = numList.get(i);
//        }
        System.out.println(Collections.max(numList));
//        return maximum;
        return Collections.max(numList);
    }




    public static void main(String[] args) {
        String word = "oscar";
        checkPalindrome(word);

        int [] testArray = {5, 6, -4, 2, 3, 2, -23};
        adjacentElementsProduct(testArray);


    }



}
