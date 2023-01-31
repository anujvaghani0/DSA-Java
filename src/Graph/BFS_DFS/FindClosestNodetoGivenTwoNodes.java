package Graph.BFS_DFS;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FindClosestNodetoGivenTwoNodes {
    public static void main(String[] args) {
        int[] edges = {1, 2, 2, -1};
        System.out.println(closestMeetingNode(edges, 0, 1));
    }

    public static int closestMeetingNode(int[] edges, int node1, int node2) {
        int n = edges.length;
        int[] n1Distances = calculateTheDistancesUsingBFS(edges, node1);
        int[] n2Distances = calculateTheDistancesUsingBFS(edges, node2);

        int node = -1;
        int distances = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            if (n1Distances[i] == -1 || n2Distances[i] == -1) {
                continue;
            }
            int maxDistances = Math.max(n1Distances[i], n2Distances[i]);

            if (maxDistances < distances) {
                node = i;
                distances = maxDistances;
            }
        }
        return node;
    }

    private static int[] calculateTheDistancesUsingBFS(int[] edges, int node) {
        int n = edges.length;
        boolean[] visited = new boolean[n];
        int[] distances = new int[n];

        Arrays.fill(distances, -1);

        Queue<Integer> qu = new LinkedList<>();
        qu.add(node);
        visited[node] = true;

        int dis = 0;
        while (!qu.isEmpty()) {
            for (int k = 0; k < qu.size(); k++) {
                int currentNode = qu.poll();
                distances[currentNode] = dis;
                if (edges[currentNode] != -1 && !visited[edges[currentNode]]) {
                    visited[edges[currentNode]] = true;
                    qu.add(edges[currentNode]);
                }
            }
            dis++;
        }
        return distances;
    }
}
