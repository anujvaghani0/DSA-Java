package Graph;

import java.util.ArrayList;

public class PrintAdjacencyList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(0).add(2);
        adj.get(0).add(3);
        adj.get(1).add(2);
        adj.get(2).add(0);
        adj.get(2).add(1);
        adj.get(3).add(0);
//        adj.get(4).add(2);

        ArrayList<ArrayList<Integer>> ans = printGraph(4, adj);
        int n = ans.size();
        for (int i = 0; i < n; i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static ArrayList<ArrayList<Integer>> printGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<ArrayList<Integer>> ls = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(i);
            ls.add(temp);
        }

        for (int i = 0; i < V; i++) {
            for (int it : adj.get(i)) {
                ls.get(i).add(it);
            }
        }
        return ls;
    }
}
