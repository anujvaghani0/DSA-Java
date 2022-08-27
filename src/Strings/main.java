package Strings;

public class main {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        String name = "anuj";
//        System.out.println(name.length());
//        System.out.println(name.substring(1));
//        System.out.println(name.split(" "));
        char ch='a';
        System.out.println(ch+name);
        System.out.println(ch+0);
        int[] a={1,2,3,4,5,6,7,8,9};
        for (int i:a){
            System.out.print(i+" ");
        }

    }

}
