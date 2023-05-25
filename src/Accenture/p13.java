package Accenture;

public class p13 {
    public static void main(String[] args) {
        int[] ans = {1, 2, 3, 4, 5};
        int n = ans.length % 2 == 0 ? ans.length : ans.length - 1;
        for (int i = 0; i < n; i += 2) {
            System.out.println(ans[i + 1]);
            System.out.println(ans[i]);
        }
        if (ans.length % 2 != 0) {
            System.out.println(ans[n]);
        }
    }
}