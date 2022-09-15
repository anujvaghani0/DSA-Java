package Strings;

public class TruncateSentence {
    public static void main(String[] args) {
        String s = "Hello how are you Contestant";
        System.out.println(truncateSentence(s, 4));
    }

    public static String truncateSentence(String s, int k) {
        String[] temp = s.split(" ");
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < k - 1; i++) {
            ans.append(temp[i]).append(" ");
        }
        ans.append(temp[k - 1]);
        return ans.toString();
    }
}
