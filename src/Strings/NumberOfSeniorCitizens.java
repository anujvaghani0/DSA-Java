package Strings;

public class NumberOfSeniorCitizens {
    public static void main(String[] args) {
        String[] details = {"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        System.out.println(countSeniors(details));
    }


    public static int countSeniors(String[] details) {
        int ans = 0;
        for (String ss : details) {
            int a1 = ss.charAt(11) - '0';
            int a2 = ss.charAt(12) - '0';
            if (((a1 * 10) + a2) > 60) {
                ans++;
            }
        }
        return ans;
    }
}
