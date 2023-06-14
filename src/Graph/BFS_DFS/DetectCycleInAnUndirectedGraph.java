package Graph.BFS_DFS; 

// Question link -> https://practice.geeksforgeeks.org/problems/detect-cycle-in-an-undirected-graph/1

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleInAnUndirectedGraph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(4);
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(3).add(4);
        adj.get(4).add(1);
        adj.get(4).add(3);
        System.out.println(isCycle(5, adj));
    }

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (checkOfCycle(i, V, adj, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkOfCycle(int src, int v, ArrayList<ArrayList<Integer>> adj, boolean[] visited) {
        visited[src] = true;
        Queue<pair> qu = new LinkedList<>();
        qu.add(new pair(src, -1));
        while (!qu.isEmpty()) {
            int node = qu.peek()._first;
            int parent = qu.peek()._second;
            qu.remove();

            for (int adjacentNode : adj.get(node)) {
                if (!visited[adjacentNode]) {
                    visited[adjacentNode] = true;
                    qu.add(new pair(adjacentNode, node));
                } else if (parent != adjacentNode) {
                    return true;
                }
            }
        }
        return false;
    }

    static class pair {
        int _first;
        int _second;

        public pair(int _first, int _second) {
            this._first = _first;
            this._second = _second;
        }
    }
}
