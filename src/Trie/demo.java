package Trie;

import java.util.ArrayList;
import java.util.List;

public class demo {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("asltb");
        str.add("werty");
        str.add("xcvby");
//        System.out.println(ibm(str, 'r'));
        ibm(str, 'x');
    }


    public static void ibm(List<String> str, char target) {
        char[][] ch = new char[str.size()][str.get(0).length()];
        for (int i = 0; i < str.size(); i++) {
            for (int j = 0; j < str.get(i).length(); j++) {
                ch[i][j] = str.get(i).charAt(j);
            }
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < ch.length; i++) {
            for (int j = 0; j < ch[0].length; j++) {
                if (ch[i][j] == target) {
                    start = i;
                    end = j;
                    break;
                }
            }
        }
        StringBuilder temp = new StringBuilder();
        StringBuilder temp1 = new StringBuilder();
        for (int i = start - 1; i >= 0; i--) {
            temp.append(ch[i][end]);
        }
        for (int i = end - 1; i >= 0; i--) {
            temp1.append(ch[start][i]);
        }
        System.out.println(temp.reverse());
        System.out.println(temp1.reverse());
    }
}
