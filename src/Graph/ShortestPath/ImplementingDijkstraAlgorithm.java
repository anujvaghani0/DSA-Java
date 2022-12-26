package Graph.ShortestPath;

// Question link -> https://practice.geeksforgeeks.org/problems/implementing-dijkstra-set-1-adjacency-matrix/1

import java.util.ArrayList;
import java.util.PriorityQueue;

public class ImplementingDijkstraAlgorithm {
    public static void main(String[] args) {

    }

    public static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        PriorityQueue<pair> pq = new PriorityQueue<pair>((x, y) -> x.distances - y.distances);
        int[] distance = new int[V];

        for (int i = 0; i < V; i++) {
            distance[i] = (int) (1e9);
        }

        distance[S] = 0;
        pq.add(new pair(0, S));

        while (!pq.isEmpty()) {
            int dis = pq.peek().distances;
            int node = pq.peek().node;
            pq.remove();

            for (int i = 0; i < adj.get(node).size(); i++) {
                int edgeWeight = adj.get(node).get(i).get(1);
                int adjNode = adj.get(node).get(i).get(0);

                if (dis + edgeWeight < distance[adjNode]) {
                    distance[adjNode] = dis + edgeWeight;
                    pq.add(new pair(distance[adjNode], adjNode));
                }
            }
        }
        return distance;
    }

    static class pair {
        int distances;
        int node;

        public pair(int distances, int node) {
            this.distances = distances;
            this.node = node;
        }
    }
}
