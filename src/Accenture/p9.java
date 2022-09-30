package Accenture;

public class p9 {
    public static void main(String[] args) {
        System.out.println(movehyphen("Move-Hyphens-to-Front"));
    }

    public static String movehyphen(String str) {
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)=='-'){
                ans=str.charAt(i)+ans;
            }
            else{
                ans+=str.charAt(i);
            }
        }
        return ans;
    }
}
