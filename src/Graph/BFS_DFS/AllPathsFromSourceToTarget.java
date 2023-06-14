package Graph.BFS_DFS; 

// Question link -> https://leetcode.com/problems/all-paths-from-source-to-target/

import java.util.*;

public class AllPathsFromSourceToTarget {
    public static void main(String[] args) {
        int[][] graph = {{1, 2}, {3}, {3}, {}};
        System.out.println(allPathsSourceTarget(graph));
    }

    public static List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<List<Integer>> qu = new LinkedList<>();
        qu.add(Arrays.asList(0));
        int destination = graph.length - 1;
        while (!qu.isEmpty()) {
            List<Integer> path = qu.poll();
            int current = path.get(path.size() - 1);

//            If current and Destination are same
            if (current == destination) {
                ans.add(new ArrayList<>(path));
            }

            for (int node : graph[current]) {
                List<Integer> newPath = new ArrayList<>(path);
                newPath.add(node);
                qu.add(newPath);
            }
        }
        return ans;
    }
}
