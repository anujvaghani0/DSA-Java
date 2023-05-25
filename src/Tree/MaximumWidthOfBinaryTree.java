package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class MaximumWidthOfBinaryTree {
    public static void main(String[] args) {
        TreeNode  root = new TreeNode(1);
        root . left = new TreeNode(3);
        root . left . left = new TreeNode(5);
        root . left . left . left = new TreeNode(6);
        root . right = new TreeNode(2);
        root . right . right = new TreeNode(9);
        root . right . right . left = new TreeNode(7);

        int maxWidth = widthOfBinaryTree(root);
        System.out.println(maxWidth);
    }

    public static int widthOfBinaryTree(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int ans = 0;
        Queue<Pair> qu = new LinkedList<>();
        qu.add(new Pair(root, 0));
        while (!qu.isEmpty()) {
            int size = qu.size();
            int min = qu.peek().num;
            int first = 0;
            int last = 0;
            for (int i = 0; i < size; i++) {
                int current_id = qu.peek().num - min;
                TreeNode node = qu.peek().node;
                qu.remove();
                if (i == 0) {
                    first = current_id;
                }
                if (i == size - 1) {
                    last = current_id;
                }

                if (node.left != null) {
                    qu.add(new Pair(node.left, current_id * 2 + 1));
                }

                if (node.right != null) {
                    qu.add(new Pair(node.right, current_id * 2 + 2));
                }
            }
            ans = Math.max(ans, last - first + 1);
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

    static class Pair {
        TreeNode node;
        int num;

        Pair(TreeNode _node, int _num) {
            num = _num;
            node = _node;
        }
    }
}
