package Graph.BFS_DFS;

// Question link -> https://practice.geeksforgeeks.org/problems/detect-cycle-in-a-directed-graph/1

import java.util.ArrayList;

public class DetectCycleInADirectedGraph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(1).add(2);
        adj.get(2).add(3);
        adj.get(3).add(3);
        System.out.println(isCyclic(4, adj));
    }

    public static boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] visited = new int[V];
        int[] pathVisited = new int[V];

        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                if (dfs(i, adj, visited, pathVisited)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited, int[] pathVisited) {
        visited[node] = 1;
        pathVisited[node] = 1;

        for (int it : adj.get(node)) {
            if (visited[it] == 0) {
                if (dfs(it, adj, visited, pathVisited)) {
                    return true;
                }
            } else if (pathVisited[it] == 1) {
                return true;

            }
        }
        pathVisited[node] = 0;
        return false;
    }
}
