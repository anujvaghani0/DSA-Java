package Strings;

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

        String s1 = "rohit";
        String s2 = "r1ohit";
        String[] w1 = {"anuj", "anuj100"};
        String[] w11 = {"anuj", "anuj100"};
        System.out.println(s1 + s2);
        System.out.println(s1.substring(0, 2));
//        System.out.println(27/26);

//        String s = "Let's take LeetCode contest";
        String s="anujvaghani";
        String[] arr = s.split(" ");
        System.out.println(Arrays.toString(arr));

        System.out.println(s1+s2);
        System.out.println(Integer.toString((s1.charAt(0))));

        System.out.println(s.substring(1));

        System.out.println(s.equals(s.toLowerCase()));

        StringBuilder ans=new StringBuilder(s);
//        System.out.println(ans.delete(0,1));
//     ans.append(0);
        int[] ans8=new int[3];
        System.out.println(Arrays.toString(ans8));

        String temp="$25";
        System.out.println(temp.substring(1,temp.length()));
        System.out.println(temp.charAt(1)+temp.charAt(2));
        System.out.println(temp.charAt(1)-'0');
    }
}
