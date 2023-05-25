package Accenture;

public class p11 {
    public static void main(String[] args) {
        System.out.println(replaced("apples",'a','p'));
    }

    public static String replaced(String s, char r1, char r2) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == r1) {
                ans.append(r2);
            } else if (s.charAt(i)==r2) {
                ans.append(r1);
            }else{
                ans.append(s.charAt(i));
            }
        }
        return ans.toString();
    }
}
