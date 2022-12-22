package Graph.TopologicalSorting;

// Question link -> https://leetcode.com/problems/course-schedule/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class CourseSchedule {
    public static void main(String[] args) {
        int[][] adj = {{1, 0}, {0, 1}};
        System.out.println(canFinish(2, adj));
    }

    public static boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            adj.get(prerequisites[i][0]).add(prerequisites[i][1]);
        }
        int[] indegress = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int adjacentNode : adj.get(i)) {
                indegress[adjacentNode]++;
            }
        }

        Queue<Integer> qu = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
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
        if (count == numCourses) {
            return true;
        }
        return false;
    }
}
