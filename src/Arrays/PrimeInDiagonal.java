package Arrays;

public class PrimeInDiagonal {
    public static void main(String[] args) {

    }

    public static int diagonalPrime(int[][] nums) {
        int max = 0;
        for (int i = 0, j = 0; i < nums.length && j < nums.length; i++,j++) {
            if (isPrime(nums[i][j])) {
                max = Math.max(max, nums[i][j]);
            }
            if (isPrime(nums[nums.length - i - 1][j])) {
                max = Math.max(max, nums[nums.length - i - 1][j]);
            }
        }
        return  max;
    }


    public static boolean isPrime(int num) {
        if (num <= 1) {
            return  false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return  false;
            }
        }
        return  true;
    }
}
