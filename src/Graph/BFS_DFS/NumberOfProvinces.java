package Graph.BFS_DFS;

// Question link -> https://leetcode.com/problems/number-of-provinces/

import java.util.ArrayList;

public class NumberOfProvinces {
    public static void main(String[] args) {
        int[][] adj = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(findCircleNum(adj));
    }

    public static int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        int V = isConnected.length;
        for (int i = 0; i < isConnected.length; i++) {
            ls.add(new ArrayList<>());
        }

        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                if (isConnected[i][j] == 1 && i != j) {
                    ls.get(i).add(j);
                    ls.get(j).add(i);
                }
            }
        }
        int[] visited = new int[V];
        int count = 0;
        for (int i = 0; i < V; i++) {
            if (visited[i] == 0) {
                count++;
                dfs(i, ls, visited);
            }
        }
        return count;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> ls, int[] visited) {
        visited[node] = 1;
        for (int it : ls.get(node)) {
            if (visited[it] == 0) {
                dfs(it, ls, visited);
            }
        }
    }
}
