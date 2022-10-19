package LinkedList.Questions.EASY;

//question link -> https://leetcode.com/problems/happy-number/

public class happyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do {
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while (slow != fast);

        if (slow == 1) {
            return true;
        }
        return false;
    }

    private static int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int reminder = number % 10;
            ans += reminder * reminder;
            number /= 10;
        }
        return ans;
    }
}
