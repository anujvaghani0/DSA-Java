package Matrix;

//question link -> https://leetcode.com/problems/the-employee-that-worked-on-the-longest-task/

public class TheEmployeeThatWorkedOnTheLongestTask {
    public static void main(String[] args) {
        int[][] arr = {{0, 3}, {2, 5}, {0, 9}, {1, 15}};
        System.out.println(hardestWorker(26, arr));
    }

    public static int hardestWorker(int n, int[][] logs) {
        int temp = logs[0][1];
        int maximum = logs[0][0];
        for (int i = 1; i < logs.length; i++) {
            int unit = logs[i][1] - logs[i - 1][1];
            if (unit >= temp && temp > logs[i][0]) {
                temp = unit;
                maximum = logs[i][0];
            }
        }
        return maximum;
    }
}