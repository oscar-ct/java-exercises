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




    public static void main(String[] args) {
        String word = "oscar";
        checkPalindrome(word);
    }

}
