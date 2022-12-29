package Graph.ShortestPath;

// Question link -> https://leetcode.com/problems/number-of-ways-to-arrive-at-destination/

import java.util.ArrayList;
import java.util.PriorityQueue;

public class NumberOfWaysToArriveAtDestination {
    public static void main(String[] args) {
        int[][] roads = {{0, 6, 7}, {0, 1, 2}, {1, 2, 3}, {1, 3, 3}, {6, 3, 3}, {3, 5, 1}, {6, 5, 1}, {2, 5, 1}, {0, 4, 5}, {4, 6, 2}};
        System.out.println(countPaths(7, roads));
    }

    public static int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int m = roads.length;
        for (int i = 0; i < m; i++) {
            adj.get(roads[i][0]).add(new pair(roads[i][1], roads[i][2]));
            adj.get(roads[i][1]).add(new pair(roads[i][0], roads[i][2]));
        }

        PriorityQueue<pair> pq = new PriorityQueue<>((x, y) -> x.first - y.first);
        int[] distance = new int[n];
        long[] ways = new long[n];
        for (int i = 0; i < n; i++) {
            distance[i] = (int) (1e18);
            ways[i] = 0;
        }
        distance[0] = 0;
        ways[0] = 1;
        pq.add(new pair(0, 0));
        int mod = (int) (1e9 + 7);
        while (!pq.isEmpty()) {
            int dis = pq.peek().first;
            int node = pq.peek().second;
            pq.remove();

            for (pair it : adj.get(node)) {
                int adjNode = it.first;
                int endW = it.second;
//            this is first time coming
                if (dis + endW < distance[adjNode]) {
                    distance[adjNode] = dis + endW;
                    pq.add(new pair(distance[adjNode], adjNode));
                    ways[adjNode] = ways[node];
                } else if (dis + endW == distance[adjNode]) {
                    ways[adjNode] = (ways[adjNode] + ways[node]) % mod;
                }
            }
        }
        return (int) (ways[n - 1] % mod);
    }

    static class pair {
        int first;
        int second;

        public pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
