package GreedyAlgorithm;

public class GasStation {
    public static void main(String[] args) {
        int[] gas = {2, 3, 4};
        int[] cost = {3, 4, 3};
        System.out.println(canCompleteCircuit(gas, cost));
    }

    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int total = 0;
//        our tank
        int gasAvailable = 0;

        int index = 0;

        for (int i = 0; i < n; i++) {
            total += gas[i] - cost[i];
            gasAvailable += gas[i] - cost[i];

//            if the goes -ve
            if (gasAvailable < 0) {
                gasAvailable = 0;
                index = i + 1;
            }
        }
        return (total < 0) ? -1 : index;
    }
}
