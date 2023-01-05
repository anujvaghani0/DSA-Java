package Stacks;

public class MinimumNumberOfSwapsToMakeTheStringBalanced {
    public static void main(String[] args) {
        System.out.println(minSwaps("][]["));
    }

    public static int minSwaps(String s) {
//        Using brute-force
        int open = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ']') {
                if (open > 0) {
                    open--;
                } else {
                    ans++;
                    open++;
                }
            } else {
                open++;
            }
        }
        return ans;
    }


//    using stack

}
