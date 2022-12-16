package Strings;

import java.util.Vector;

public class Complement {
    public static void main(String[] args) {
        System.out.println(findRange("01",2));
    }

    public static Vector<Integer> findRange(String str, int n) {
        Vector<Integer> ans = new Vector<>();
        int maxl = 0, maxr = 0, msf = 0, meh = 0, s = 0;
        for (int i = 0; i < str.length(); i++) {
            meh += (str.charAt(i) == '0') ? 1 : -1;
            if (msf < meh) {
                msf = meh;
                maxl = s;
                maxr = i;
            }
            if (meh < 0) {
                meh = 0;
                s = i + 1;
            }
        }

        if ((maxl == 0 || maxr == 0) && msf == 0) {
            ans.add(-1);
            return ans;
        }
        ans.add(maxl + 1);
        ans.add(maxr + 1);

        return ans;
    }
}
