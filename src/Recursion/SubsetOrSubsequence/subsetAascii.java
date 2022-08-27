package Recursion.SubsetOrSubsequence;

public class subsetAascii {
    public static void main(String[] args) {
        subset("","abc");

    }
    public static void subset(String p,String up){
        if (up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subset(p+ch,up.substring(1));
        subset(p,up.substring(1));
        subset(p+(ch+0),up.substring(1));
    }
}
