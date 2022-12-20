package Graph.BFS_DFS;

import java.util.ArrayList;

public class DetectCycleInAnUndirectedGraphUsingDFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(4);
        adj.get(0).add(2);
        adj.get(1).add(1);
        adj.get(1).add(2);
        adj.get(2).add(2);
        adj.get(2).add(3);
//        adj.get(3).add(4);
//        adj.get(4).add(1);
//        adj.get(4).add(3);
        System.out.println(isCycle(5, adj));
    }

    public static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                if (dfs(i, -1, visited, adj)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean dfs(int node, int parent, boolean[] visited, ArrayList<ArrayList<Integer>> adj) {
        visited[node] = true;
        for (int adjacentNode : adj.get(node)) {
            if (!visited[adjacentNode]) {
                if (dfs(adjacentNode, node, visited, adj)) {
                    return true;
                } else if (visited[adjacentNode] && adjacentNode != parent) {
                    return true;
                }
            }
        }
        return false;
    }
}
