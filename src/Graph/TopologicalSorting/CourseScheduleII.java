package Graph.TopologicalSorting; 

// Question link -> https://leetcode.com/problems/course-schedule-ii/

import java.util.*;

public class CourseScheduleII {
    public static void main(String[] args) {
        int[][] adj = {{0, 1}, {1, 0}};
        System.out.println(Arrays.toString(findOrder(2, adj)));
    }


    public static int[] findOrder(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] prerequisite : prerequisites) {
            adj.get(prerequisite[1]).add(prerequisite[0]);
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
        ArrayList<Integer> temp = new ArrayList<>();
        while (!qu.isEmpty()) {
            int node = qu.peek();
            qu.remove();
            temp.add(node);
            for (int adjacentNode : adj.get(node)) {
                indegress[adjacentNode]--;
                if (indegress[adjacentNode] == 0) {
                    qu.add(adjacentNode);
                }
            }
        }

        if (temp.size() != numCourses) {
            return new int[]{};
        }

        int[] ans = new int[numCourses];
        for (int i = 0; i < temp.size(); i++) {
            ans[i] = temp.get(i);
        }
        return ans;
    }
}
