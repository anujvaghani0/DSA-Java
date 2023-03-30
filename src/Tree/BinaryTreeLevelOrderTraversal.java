package Tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {
    public static void main(String[] args) {
        int[] nodes = {3, 9, -1, -1, 20, 15, -1, -1, 7, -1, -1};
        BinaryTree tree = new BinaryTree();
        TreeNode root = tree.buildTree(nodes);
        System.out.println(levelOrder(root));

    }

    public static class BinaryTree {
        static int index = -1;

        public static TreeNode buildTree(int[] nodes) {
            index++;
            if (nodes[index] == -1) {
                return null;
            }
            TreeNode newNode = new TreeNode(nodes[index]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }
    }

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new LinkedList<>();
        Queue<TreeNode> qu = new LinkedList<>();
        if (root == null) {
            return ans;
        }

        qu.add(root);
        while (!qu.isEmpty()) {
            int n = qu.size();
            List<Integer> l = new LinkedList<>();
            for (int i = 0; i < n; i++) {
                TreeNode current = qu.remove();
                l.add(current.val);
                if (current.left != null) {
                    qu.add(current.left);
                }
                if (current.right != null) {
                    qu.add(current.right);
                }
            }
            ans.add(l);
        }
        return ans;
    }


    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
