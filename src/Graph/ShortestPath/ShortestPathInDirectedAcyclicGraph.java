package Graph.ShortestPath;

// Question link -> https://practice.geeksforgeeks.org/problems/shortest-path-in-undirected-graph/1

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class ShortestPathInDirectedAcyclicGraph {
    public static void main(String[] args) {
        int[][] edges = {{0, 1, 2}, {0, 4, 1}, {4, 5, 4}, {4, 2, 2}, {1, 2, 3}, {2, 3, 6}, {5, 3, 1}};
        System.out.println(Arrays.toString(shortestPath(6, 7, edges)));
    }

    public static int[] shortestPath(int N, int M, int[][] edges) {
        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            ArrayList<pair> temp = new ArrayList<pair>();
            adj.add(temp);
        }

        for (int i = 0; i < M; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int wt = edges[i][2];
            adj.get(u).add(new pair(v, wt));
        }

        boolean[] visited = new boolean[N];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < N; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, st);
            }
        }

        int[] distance = new int[N];
        for (int i = 0; i < N; i++) {
            distance[i] = (int) 1e9;
        }
        distance[0] = 0;
        while (!st.empty()) {
            int node = st.peek();
            st.pop();
            for (int i = 0; i < adj.get(node).size(); i++) {
                int v = adj.get(node).get(i)._first;
                int wt = adj.get(node).get(i)._second;
                if (distance[node] + wt < distance[v]) {
                    distance[v] = wt + distance[node];
                }
            }
        }
        for (int i = 0; i < N; i++) {
            if (distance[i] == 1e9) distance[i] = -1;
        }
        return distance;
    }

    private static void dfs(int node, ArrayList<ArrayList<pair>> adj, boolean[] visited, Stack<Integer> st) {
        visited[node] = true;
        for (int i = 0; i < adj.get(node).size(); i++) {
            int adjacentNode = adj.get(node).get(i)._first;
            if (!visited[adjacentNode]) {
                dfs(adjacentNode, adj, visited, st);
            }
        }
        st.push(node);
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
