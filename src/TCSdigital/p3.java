package TCSdigital;

import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int length = str.length();
        String str1 = "";
        String str2 = "";
        String str3 = "";
        boolean flag = false;

        for (int i = 1; i < length - 1; i++) {
            str1 = str.substring(0, i);
            if (isPalindrome(str1)) {
                for (int j = 1; j < length - i; j++) {
                    str2 = str.substring(i, i + j);
                    str3 = str.substring(i + j, length);
                    if (isPalindrome(str2) && isPalindrome(str3)) {
                        System.out.println(str1+"\n"+str2+"\n"+str3);
                        flag=true;
                        break;
                    }
                }
                if (flag){
                    break;
                }
            }
        }
        if (!flag){
            System.out.println("IMPOSSIBLE");
        }
    }

    public static boolean isPalindrome(String s) {
        if (s.length() == 1) {
            return true;
        }
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String rev = new String(sb);
        return s.equals(rev);
    }
}
