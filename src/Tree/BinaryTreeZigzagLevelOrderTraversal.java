package Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeZigzagLevelOrderTraversal {
    public static void main(String[] args) {

    }

    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> qu = new LinkedList<TreeNode>();
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null) {
            return ans;
        }

        qu.add(root);
        boolean flag = true;

        while (!qu.isEmpty()) {
            int size = qu.size();

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {

                if (qu.peek().left != null) {
                    qu.add(qu.peek().left);
                }

                if (qu.peek().right != null) {
                    qu.add(qu.peek().right);
                }

//                if the flag is true it means traversal to left to right
                if (flag) {
                    list.add(qu.poll().val);
//                    right to left
                } else {
                    list.add(0, qu.poll().val);
                }
            }

            flag = !flag;

            ans.add(list);
        }
        return ans;
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

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
