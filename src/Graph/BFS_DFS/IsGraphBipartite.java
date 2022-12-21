package Graph.BFS_DFS;

// Question link -> https://leetcode.com/problems/is-graph-bipartite/

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class IsGraphBipartite {
    public static void main(String[] args) {
        int[][] graph = {{1, 2, 3}, {0, 2}, {0, 1, 3}, {0, 2}};
        System.out.println(isBipartite(graph));
    }

    public static boolean isBipartite(int[][] graph) {
            int n = graph.length;
    //        int m = graph[0].length;
            int[] color = new int[n];
            Arrays.fill(color, -1);
            for (int i = 0; i < n; i++) {
                if (color[i] == -1) {
                    if (!bfs(i, n, graph, color)) {
                        return false;
                    }
                }
            }
            return true;
        }

        private static boolean bfs(int start, int n, int[][] graph, int[] color) {
            Queue<Integer> qu = new LinkedList<>();
            qu.add(start);
            color[start] = 0;
            while (!qu.isEmpty()) {
                int node = qu.peek();
                qu.remove();

                for (int adjacentNode : graph[node]) {
                    if (color[adjacentNode] == -1) {
                        color[adjacentNode] = 1 - color[node];
                        qu.add(adjacentNode);
                    } else if (color[adjacentNode] == color[node]) {
                        return false;
                    }
                }
            }
            return true;
    }
}
