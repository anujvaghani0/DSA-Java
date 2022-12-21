package Graph.BFS_DFS;

// Question link -> https://leetcode.com/problems/possible-bipartition/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PossibleBipartition {
    public static void main(String[] args) {
        int[][] dislike = {{1, 2}, {1, 3}, {2, 4}};
        System.out.println(possibleBipartition(4, dislike));
    }

    public static boolean possibleBipartition(int n, int[][] dislikes) {
        int[] color = new int[n + 1];
        Arrays.fill(color, -1);
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] e : dislikes) {
            graph.get(e[0]).add(e[1]);
            graph.get(e[1]).add(e[0]);
        }
        for (int i = 1; i <= n; i++) {
            if (color[i] == -1) {
                if (!bfs(i, graph, color)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean bfs(int start, ArrayList<ArrayList<Integer>> graph, int[] color) {
        Queue<Integer> qu = new LinkedList<>();
        qu.add(start);
        color[start] = 0;
        while (!qu.isEmpty()) {
            int node = qu.peek();
            int col = 1 - color[node];
            qu.remove();

            for (int adjacentNode : graph.get(node)) {
                if (color[adjacentNode] == -1) {
                    color[adjacentNode] = col;
                    qu.add(adjacentNode);
                } else if (color[adjacentNode] != col) {
                    return false;
                }
            }
        }
        return true;
    }
}
