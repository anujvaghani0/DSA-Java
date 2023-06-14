package Graph.BFS_DFS; 

// Question link -> https://leetcode.com/problems/keys-and-rooms/

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class KeysAndRooms {
    public static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(1);
        adj.get(0).add(3);
        adj.get(1).add(3);
        adj.get(1).add(0);
        adj.get(1).add(1);
        adj.get(2).add(2);
        adj.get(3).add(0);
        System.out.println(canVisitAllRooms(adj));
    }

    public static boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        Queue<Integer> qu = new LinkedList<>();
        qu.add(0);
        visited[0] = true;
        while (!qu.isEmpty()) {
            int node = qu.peek();
            qu.remove();
            for (int adjacentNode : rooms.get(node)) {
                if (!visited[adjacentNode]) {
                    visited[adjacentNode] = true;
                    qu.add(adjacentNode);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                return false;
            }
        }
        return true;
    }
}
