package Strings;

public class DecryptStringFromAlphabetToIntegerMapping {
    public static void main(String[] args) {

    }

    public static String freqAlphabets(String s) {
        StringBuilder temp= new StringBuilder();
        String ans="";
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='#'){
                for (int j=i;j>=0;j--) {
                    temp.append(s.charAt(j));
                    ans = temp.toString() + '0';
                }
            }else{
                ans+=s.charAt(i);
            }
        }
        return ans;
    }
}
