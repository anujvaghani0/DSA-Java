package Graph.BFS_DFS; 

// Question link -> https://practice.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(2).add(4);
//        adj.get(1).add(2);
//        adj.get(2).add(1);
//        adj.get(1).add(3);
//        adj.get(3).add(1);

        ArrayList<Integer> ans = bfsOfGraph(5, adj);
        System.out.println(ans);
//        int n = ans.size();
//        for (int i = 0; i < n; i++) {
//            System.out.print(ans.get(i) + " ");
//        }
    }

    public static ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> bfs = new ArrayList<>();
        boolean[] visitior = new boolean[V];
        Queue<Integer> qu = new LinkedList<>();
        qu.add(0);
        visitior[0] = true;
        while (!qu.isEmpty()) {
            Integer node = qu.poll();
            bfs.add(node);

            for (Integer i : adj.get(node)) {
                if (!visitior[i]) {
                    visitior[i] = true;
                    qu.add(i);
                }
            }
        }
        return bfs;
    }
}
