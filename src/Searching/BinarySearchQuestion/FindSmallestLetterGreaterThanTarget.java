package Searching.BinarySearchQuestion;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'd';
        char ans = letter(letters, target);
        System.out.println(ans);
    }

    public static char letter(char[] str, char target) {
        int start = 0;
        int end = str.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < str[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return str[start % str.length];
    }
}
