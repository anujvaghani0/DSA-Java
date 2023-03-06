package Graph.ShortestPath;

// Question link -> https://leetcode.com/problems/cheapest-flights-within-k-stops/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class CheapestFlightsWithinKStops {
    public static void main(String[] args) {
        int[][] flights = {{0, 1, 5}, {0, 3, 2}, {3, 1, 2}, {1, 2, 5}, {1, 4, 1},
                {4, 2, 1}};
        System.out.println(findCheapestPrice(5, flights, 0, 2, 2));
    }

    public static int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        int m = flights.length;
        for (int i = 0; i < m; i++) {
            adj.get(flights[i][0]).add(new pair(flights[i][1], flights[i][2]));
        }

        Queue<Tuple> qu = new LinkedList<>();
        qu.add(new Tuple(0, src, 0));
        int[] distance = new int[n];

        for (int i = 0; i < n; i++) {
            distance[i] = (int) (1e9);
        }

        distance[src] = 0;

        while (!qu.isEmpty()) {
            Tuple it = qu.peek();
            qu.remove();
            int stops = it.first;
            int node = it.second;
            int cost = it.third;

            if (stops > k) {
                continue;
            }

            for (pair interior : adj.get(node)) {
                int adjNode = interior.first;
                int endW = interior.second;
                if (cost + endW < distance[adjNode] && stops <= k) {
                    distance[adjNode] = cost + endW;
                    qu.add(new Tuple(stops + 1, adjNode, cost + endW));
                }
            }
        }
        if (distance[dst] == 1e9) {
            return -1;
        }
        return distance[dst];
    }

    static class pair {
        int first;
        int second;

        public pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static class Tuple {
        int first;
        int second;
        int third;

        public Tuple(int first, int second, int third) {
            this.first = first;
            this.second = second;
            this.third = third;
        }
    }
}
