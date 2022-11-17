package DynamicProgramming.Knapsack;

public class zeroORoneKanpsack {
    public static void main(String[] args) {
        int[] values = {60, 100, 20};
        int[] weight = {20, 10, 30};
        System.out.println(knapsack(values, weight, 50, values.length));
    }

    public static int knapsack(int[] values, int[] weight, int w, int n) {
        if (n == 0 || w == 0) {
            return 0;
        }
        if (weight[n - 1] > w) {
            return knapsack(values, weight, w, n - 1);
        } else {
            return Math.max(values[n - 1] + knapsack(values, weight, w - weight[n - 1], n - 1),
                    knapsack(values, weight, w, n - 1));
        }
    }
}
