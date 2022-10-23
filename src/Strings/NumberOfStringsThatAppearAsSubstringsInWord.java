package Strings;

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args) {
//        String[] patterns = {"glgpqusg", "qsyrgdelg", "akcsg", "e", "fnmi", "gzqsyrgdelg", "lapwypxrmaydjr", "s", "iwig"};
//        String word = "numiwigzqsyrgdelgxs";
        String[] patterns = {"a","a","a"};
//        String[] patterns = {"a","abc","bc","d"};
        String word = "ab";
        System.out.println(numOfStrings(patterns, word));
    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        for (String s : patterns) {
            boolean flag = word.contains(s);
            if (flag) {
                count++;
            }
        }
        return count;
    }
}
