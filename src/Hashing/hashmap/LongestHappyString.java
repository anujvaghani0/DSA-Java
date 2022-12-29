package Hashing.hashmap;

// Question link -> https://leetcode.com/problems/longest-happy-string/

import java.util.PriorityQueue;

public class LongestHappyString {
    public static void main(String[] args) {
        System.out.println(longestDiverseString(7,1,0));
    }

    public static String longestDiverseString(int a, int b, int c) {
        StringBuilder ans = new StringBuilder();
        PriorityQueue<pair> pq = new PriorityQueue<>((x, y) -> (y._first - x._first));
        if (a > 0) {
            pq.add(new pair(a, 'a'));
        }

        if (b > 0) {
            pq.add(new pair(b, 'b'));
        }

        if (c > 0) {
            pq.add(new pair(c, 'c'));
        }

        ans.append("dd");

        while (!pq.isEmpty()) {
            pair first = pq.remove();
            if (first.ch == ans.charAt(ans.length() - 2) && first.ch == ans.charAt(ans.length() - 1)) {
                if (pq.isEmpty()) {
                    break;
                }

                pair second = pq.remove();
                ans.append(second.ch);

//               update the second pair and the queue
                if (second._first > 1) {
                    second._first--;
                    pq.add(second);
                }

                pq.add(first);
            } else {
                ans.append(first.ch);

//                Update first  pair and it back
                if (first._first > 1) {
                    first._first--;
                    pq.add(first);
                }
            }
        }
        return ans.substring(2);
    }

    static class pair {
        int _first;
        char ch;

        public pair(int _first, char _second) {
            this._first = _first;
            this.ch = _second;
        }
    }
}
