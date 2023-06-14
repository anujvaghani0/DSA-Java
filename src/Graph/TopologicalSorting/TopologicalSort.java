package Graph.TopologicalSorting; 

// Question link -> https://practice.geeksforgeeks.org/problems/topological-sort/1

//DIRECT ACYCLIC SORT (DAC)

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class TopologicalSort {
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

        System.out.println(Arrays.toString(topoSort(6, adj)));
    }

    public static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                dfs(i, adj, visited, st);
            }
        }
        int[] ans = new int[V];
        int i = 0;
        while (!st.empty()) {
            ans[i++] = st.peek();
            st.pop();
        }
        return ans;
    }

    private static void dfs(int node, ArrayList<ArrayList<Integer>> adj, boolean[] visited, Stack<Integer> st) {
        visited[node] = true;
        for (int adjacentNode : adj.get(node)) {
            if (!visited[adjacentNode]) {
                dfs(adjacentNode, adj, visited, st);
            }
        }
        st.push(node);
    }
}
