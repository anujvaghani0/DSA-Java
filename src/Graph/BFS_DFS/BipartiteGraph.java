package Graph.BFS_DFS;

// Question link -> https://practice.geeksforgeeks.org/problems/bipartite-graph/1

import java.util.ArrayList;
import java.util.Arrays;

public class BipartiteGraph {
    public static void main(String[] args) {

    }

    public static boolean isBipartite(int n, ArrayList<ArrayList<Integer>> graph) {
        int[] color = new int[n];
        Arrays.fill(color, -1);
        for (int i = 0; i < n; i++) {
            if (color[i] == -1) {
                if (!dfs(i, 0, graph, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean dfs(int node, int n, ArrayList<ArrayList<Integer>> graph, int[] color) {
        color[node] = n;
        for (int adjacentNode : graph.get(node)) {
            if (color[adjacentNode] == -1) {
                if (!dfs(adjacentNode, 1 - n, graph, color)) {
                    return false;
                } else if (color[adjacentNode] == n) {
                    return false;
                }
            }
        }
        return true;
    }
}
