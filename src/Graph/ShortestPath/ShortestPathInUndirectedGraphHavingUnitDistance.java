package Graph.ShortestPath; 

// Question link -> https://practice.geeksforgeeks.org/problems/shortest-path-in-undirected-graph-having-unit-distance/1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInUndirectedGraphHavingUnitDistance {
    public static void main(String[] args) {
        int n = 9, m = 10;
        int[][] edge = {{0, 1}, {0, 3}, {3, 4}, {4, 5}, {5, 6}, {1, 2}, {2, 6}, {6, 7}, {7, 8}, {6, 8}};

        System.out.println(Arrays.toString(shortestPath(edge, n, m, 0)));
    }

    public static int[] shortestPath(int[][] edges, int n, int m, int src) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            adj.get(edges[i][0]).add(edges[i][1]);
            adj.get(edges[i][1]).add(edges[i][0]);
        }

        int[] distance = new int[n];
        for (int i = 0; i < n; i++) {
            distance[i] = (int) 1e9;
        }
        distance[src] = 0;

        Queue<Integer> qu = new LinkedList<>();
        qu.add(src);
        while (!qu.isEmpty()) {
            int node = qu.peek();
            qu.remove();
            for (int adjacentNode : adj.get(node)) {
                if (distance[node] + 1 < distance[adjacentNode]) {
                    distance[adjacentNode] = 1 + distance[node];
                    qu.add(adjacentNode);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (distance[i] == 1e9) {
                distance[i] = -1;
            }
        }
        return distance;
    }
}
