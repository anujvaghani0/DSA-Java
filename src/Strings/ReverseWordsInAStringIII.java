package Strings;

public class ReverseWordsInAStringIII {
    public static void main(String[] args) {
    String s="Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    public static String reverseWords(String s) {
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while (i < s.length()) {
           if (s.charAt(i)==' '){
               i++;
           }
           else{
               for (int j=i;j<=i;j++){
                   ans.append(s.charAt(i));
               }
               ans.reverse();
               i++;
           }
        }
        return ans.toString();
    }
}
