package Graph.TopologicalSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class DetectACycleInDirectedGraph {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(3);
        adj.get(2).add(3);
        adj.get(4).add(0);
        adj.get(4).add(1);
        adj.get(5).add(0);
        adj.get(5).add(2);

        System.out.println(topoSort(6, adj));
    }

    public static boolean topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] indegress = new int[V];
        for (int i = 0; i < V; i++) {
            for (int adjacentNode : adj.get(i)) {
                indegress[adjacentNode]++;
            }
        }

        Queue<Integer> qu = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegress[i] == 0) {
                qu.add(i);
            }
        }

        int count = 0;
        while (!qu.isEmpty()) {
            int node = qu.peek();
            qu.remove();
            count++;
            for (int adjacentNode : adj.get(node)) {
                indegress[adjacentNode]--;
                if (indegress[adjacentNode] == 0) {
                    qu.add(adjacentNode);
                }
            }
        }
//      it means no cycle in the graph
        if (count == V) {
            return false;
        }
        return true;
    }
}
