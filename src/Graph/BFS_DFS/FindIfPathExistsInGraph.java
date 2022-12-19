package Graph.BFS_DFS;

// Question link -> https://leetcode.com/problems/find-if-path-exists-in-graph/

import java.util.ArrayList;
import java.util.List;

public class FindIfPathExistsInGraph {
    public static void main(String[] args) {
        int[][] edges = {{0, 1}, {0, 2}, {3, 5}, {5, 4}, {4, 3}};
        System.out.println(validPath(6, edges, 0, 5));
    }

    public static boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> ls = buildGraph(n, edges);
        boolean[] visited = new boolean[n];
        return hasPath(ls, visited, source, destination);
    }

    private static boolean hasPath(List<List<Integer>> ls, boolean[] visited, int source, int destination) {
        if (source == destination) {
            return true;
        }
        visited[source] = true;

        for (int neighbour : ls.get(source)) {
            if (visited[neighbour]) {
                continue;
            }
            if (hasPath(ls, visited, neighbour, destination)) {
                return true;
            }
        }
        return false;
    }


    private static List<List<Integer>> buildGraph(int n, int[][] edges) {
        List<List<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            graph.get(edge[0]).add(edge[1]);
            graph.get(edge[1]).add(edge[0]);
        }

        return graph;
    }
}
