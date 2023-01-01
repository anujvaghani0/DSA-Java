package Stacks;

// Question link -> https://leetcode.com/problems/exclusive-time-of-functions/

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ExclusiveTimeOfFunctions {
    public static void main(String[] args) {
        String[] logs = {"0:start:0", "0:start:2", "0:end:5", "0:start:6", "0:end:6", "0:end:7"};
        List<String> temp = Arrays.asList(logs);
//        temp.add("0:start:0");
//        temp.add("1:start:2");
//        temp.add("1:end:5");
//        temp.add("0:end:6");
        System.out.println(Arrays.toString(exclusiveTime(2, temp)));
    }

    public static int[] exclusiveTime(int n, List<String> logs) {
        Stack<execution> st = new Stack<>();

        for (String log : logs) {
            st.add(new execution(log));
        }

        int[] ans = new int[n];

        Stack<execution> backgroundExecution = new Stack<>();
        while (!st.empty()) {
            execution ex = st.pop();
            if (st.peek().isEnd) {
                backgroundExecution.push(ex);
            } else {
                int executionTime = 1 + (ex.time - st.pop().time);
                ans[ex.id] += executionTime;

                while (!backgroundExecution.isEmpty()) {
                    execution toexecution = backgroundExecution.pop();
                    toexecution.time -= executionTime;
                    st.push(toexecution);
                }
            }
        }
        return ans;
    }

    static class execution {
        int id;
        boolean isEnd;
        int time;

        public execution(String log) {
            String[] execution = log.split(":");
            this.id = Integer.parseInt(execution[0]);
            this.isEnd = execution[1].equals("end");
            this.time = Integer.parseInt(execution[2]);
        }
    }
}
