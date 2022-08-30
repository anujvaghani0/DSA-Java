package BitwiseOperators;

public class findUnique {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 2, 5, 3, 4, 6, 5};
        System.out.println(find(arr));
    }

    public static int find(int[] arr) {
        int unique = 0;
        for (int i = 0; i < arr.length; i++) {
            unique = unique ^ arr[i];
        }
        return unique;
    }
}
