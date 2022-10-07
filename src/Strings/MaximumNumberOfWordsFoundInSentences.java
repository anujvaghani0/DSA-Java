package Strings;

//question link -> https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/


public class MaximumNumberOfWordsFoundInSentences {
    public static void main(String[] args) {
    String[] sentences={"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(mostWordsFound(sentences));
    }

    public static int mostWordsFound(String[] sentences) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < sentences.length; i++) {
            String[] temp = sentences[i].split(" ");
            if (temp.length > max) {
                max = temp.length;
            }
        }
        return max;
    }
}
