package Strings;

public class DetectCapital {
    public static void main(String[] args)   {
        System.out.println(detectCapitalUse("USA"));
    }

    public static boolean detectCapitalUse(String word) {
        return word.equals(word.toUpperCase()) ||
                word.equals(word.toLowerCase()) ||
                (Character.isUpperCase(word.charAt(0)) &&
                        word.substring(1).equals(word.substring(1).toLowerCase()));
    }
}
