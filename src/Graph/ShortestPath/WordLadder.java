package Graph.ShortestPath; 

// Question link -> https://leetcode.com/problems/word-ladder/

import java.util.*;

public class WordLadder {
    public static void main(String[] args) {
        String[] arr = {"hot", "dot", "dog", "lot", "log", "cog"};
        List<String> ls = new ArrayList<>(List.of(arr));
        System.out.println(ladderLength("hit", "cog", ls));
    }

    public static int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Queue<pair> qu = new LinkedList<>();
        qu.add(new pair(beginWord, 1));
        Set<String> st = new HashSet<>(wordList);
//        int length= wordList.size();
//        for (int i = 0; i < length; i++) {
//            st.add(wordList.get(i));
//        }

        st.remove(beginWord);
        while (!qu.isEmpty()) {
            String word = qu.peek()._first;
            int step = qu.peek()._second;
            qu.remove();


            if (word.equals(endWord)) {
                return step;
            }

            for (int i = 0; i < word.length(); i++) {
                for (char ch = 'a'; ch <= 'z'; ch++) {
                    char[] replacedCharArray = word.toCharArray();
                    replacedCharArray[i] = ch;
                    String replacedWord = new String(replacedCharArray);

                    if (st.contains(replacedWord)) {
                        st.remove(replacedWord);
                        qu.add(new pair(replacedWord, step + 1));
                    }
                }

            }
        }
        return 0;
    }

    static class pair {
        String _first;
        int _second;

        public pair(String _first, int _second) {
            this._first = _first;
            this._second = _second;
        }
    }
}
