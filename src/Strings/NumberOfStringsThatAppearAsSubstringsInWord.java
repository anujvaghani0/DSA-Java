package Strings;

public class NumberOfStringsThatAppearAsSubstringsInWord {
    public static void main(String[] args) {
//        String[] patterns = {"glgpqusg","qsyrgdelg","akcsg","e","fnmi","gzqsyrgdelg","lapwypxrmaydjr","s","iwig"};
//        String word = "numiwigzqsyrgdelgxs";
        String[] patterns = {"ab", "abc", "da"};
        String word = "ab";
        System.out.println(numOfStrings(patterns, word));
    }

    public static int numOfStrings(String[] patterns, String word) {
        int count = 0;
        StringBuilder temp = new StringBuilder();
        int i = 0;
        while (i < word.length()) {
            if (temp.length() == 0) {
                temp.append(word.charAt(i));
                i++;
            } else if (word.charAt(i - 1) == word.charAt(i)) {
                i++;
            } else {
                temp.append(word.charAt(i));
                i++;
            }
        }

        for (int j = 0; j < patterns.length; j++) {
            int k = 0;
            int z = 0;
            while (k < patterns[j].length() && z < temp.length()) {
                if (patterns[j].charAt(k) == temp.charAt(z)) {
                    count++;
                    break;
                } else {
                    k++;
                }
            }
        }
        return count;
    }
}
