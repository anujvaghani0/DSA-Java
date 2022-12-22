package Graph.TopologicalSorting;

// Question link -> https://practice.geeksforgeeks.org/problems/alien-dictionary/0

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class AlienDictionary {
    public static void main(String[] args) {
        String[] dict = {"baa", "abcd", "abca", "cab", "cad"};
        System.out.println(findOrder(dict, dict.length, 4));
    }

    public static String findOrder(String[] dict, int N, int K) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < K; i++) {
            adj.add(new ArrayList<>());
        }

        for (int i = 0; i < N - 1; i++) {
            String s1 = dict[i];
            String s2 = dict[i + 1];
            int length = Math.min(s1.length(), s2.length());
            for (int j = 0; j < length; j++) {
                if (s1.charAt(j) != s2.charAt(j)) {
                    adj.get(s1.charAt(j) - 'a').add(s2.charAt(j) - 'a');
                    break;
                }
            }
        }

        int[] topo = topoSort(K, adj);
        String ans = "";
        for (int i = 0; i < topo.length; i++) {
            ans += (char) (topo[i] + 'a');
        }
        return ans;
    }


    private static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) {
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

        int[] ans = new int[V];
        int i = 0;
        while (!qu.isEmpty()) {
            int node = qu.peek();
            qu.remove();
            ans[i++] = node;
            for (int adjacentNode : adj.get(node)) {
                indegress[adjacentNode]--;
                if (indegress[adjacentNode] == 0) {
                    qu.add(adjacentNode);
                }
            }
        }
        return ans;
    }
}
