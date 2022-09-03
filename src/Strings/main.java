package Strings;

import java.sql.Array;
import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        String name = "anuj";
        System.out.println(name.length());
//        System.out.println(name.substring(1));
//        System.out.println(name.split(" "));
        char ch = 'a';
        System.out.println(ch + name);
        System.out.println(ch + 0);
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        for (int i : a) {
//            System.out.print(i + " ");
//        }
        String number = "12";
        int digit = number.charAt(0) - '0';
        System.out.println(digit);

//        int[][] ans = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        for (int[] i:ans){
//            for (int elements:i){
//                System.out.println(Arrays.toString(ans[elements]));
//            }
//        }

       String s1="rohit";
       String s2="r1ohit";
       String[] w1={"anuj","anuj100"};
       String[] w11={"anuj","anuj100"};
        System.out.println(s1+s2);
        System.out.println(s1.substring(0,2));
//        System.out.println(27/26);
    }
}
