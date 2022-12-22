package Graph.BFS_DFS;

// Question link -> https://leetcode.com/problems/find-eventual-safe-states/

import java.util.ArrayList;
import java.util.List;

public class FindEventualSafeStates {
    public static void main(String[] args) {
        int[][] adj = {{1, 2}, {2, 3}, {5}, {0}, {5}, {}, {}};
        System.out.println(eventualSafeNodes(adj));
    }

    public static List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;
        int[] visited = new int[V];
        int[] pathVisited = new int[V];
        int[] check = new int[V];

        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                dfs(i, graph, visited, pathVisited, check);
            }
        }
        List<Integer> safeNodes = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            if (check[i] == 1) {
                safeNodes.add(i);
            }
        }
        return safeNodes;
    }

    private static boolean dfs(int node, int[][] graph, int[] visited, int[] pathVisited, int[] check) {
        visited[node] = 1;
        pathVisited[node] = 1;
        check[node] = 0;
        for (int it : graph[node]) {
            if (visited[it] == 0) {
                if (dfs(it, graph, visited, pathVisited, check)) {
                    return true;
                }
            } else if (pathVisited[it] == 1) {
                return true;

            }
        }
        check[node] = 1;
        pathVisited[node] = 0;
        return false;
    }
}
