package Strings;

public class DefangingAnIPAddress {
    public static void main(String[] args) {
        String address="1.1.1.1";
        System.out.println(defangIPaddress(address));
    }

    public static String defangIPaddress(String address) {
            StringBuilder ans=new StringBuilder();
            int i=0;
            String temp="[.]";
            while (i<address.length()){
                if (address.charAt(i)=='.'){
                    ans.append(temp);
                    i++;
                }else{
                    ans.append(address.charAt(i));
                    i++;
                }
            }
            return ans.toString();
    }
}
