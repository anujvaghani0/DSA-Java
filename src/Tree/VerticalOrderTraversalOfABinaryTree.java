package Tree;

import java.util.*;

public class VerticalOrderTraversalOfABinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        List<List<Integer>> list = new ArrayList<>();
        list = verticalTraversal(root);
        System.out.println(list);
    }

    public static List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> qu = new LinkedList<>();
        qu.add(new Tuple(root, 0, 0));
        while (!qu.isEmpty()) {
            Tuple tuple = qu.remove();
            TreeNode node = tuple.node;
            int x = tuple.row;
            int y = tuple.col;

            if (!map.containsKey(x)) {
                map.put(x, new TreeMap<>());
            }

            if (!map.get(x).containsKey(y)) {
                map.get(x).put(y, new PriorityQueue<>());
            }

            map.get(x).get(y).offer(node.data);

            if (node.left != null) {
                qu.add(new Tuple(node.left, x - 1, y + 1));
            }

            if (node.right != null) {
                qu.add(new Tuple(node.right, x + 1, y + 1));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for (TreeMap<Integer, PriorityQueue<Integer>> ys : map.values()) {
            ans.add(new ArrayList<>());
            for (PriorityQueue<Integer> nodes : ys.values()) {
                while (!nodes.isEmpty()) {
                    ans.get(ans.size() - 1).add(nodes.poll());
                }
            }
        }
        return ans;
    }


    static class TreeNode {
        int data;
        TreeNode left, right;

        TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }

    static class Tuple {
        TreeNode node;
        int row;
        int col;

        public Tuple(TreeNode node, int row, int col) {
            this.node = node;
            this.row = row;
            this.col = col;
        }
    }
}
