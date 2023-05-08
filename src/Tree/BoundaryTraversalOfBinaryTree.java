package Tree;

import java.util.ArrayList;

public class BoundaryTraversalOfBinaryTree {
    public static void main(String[] args) {

    }

    public static ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        if (!isLeaf(node)) ans.add(node.data);
        addLeftBoundary(node, ans);
        addLeaves(node, ans);
        addRightBoundary(node, ans);
        return ans;
    }

    public static Boolean isLeaf(Node root) {
        return (root.left == null) && (root.right == null);
    }

    // checking the left boundary
    public static void addLeftBoundary(Node root, ArrayList<Integer> res) {
        Node current = root.left;
        while (current != null) {
            if (!isLeaf(current)) {
                res.add(current.data);
            }

            if (current.left != null) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
    }


//    checking the leaves

    public static void addLeaves(Node root, ArrayList<Integer> res) {
        if (isLeaf(root)) {
            res.add(root.data);
        }
        if (root.left != null) {
            addLeaves(root.left, res);
        }

        if (root.right != null) {
            addLeaves(root.right, res);
        }
    }

    public static void addRightBoundary(Node root, ArrayList<Integer> res) {
        Node current = root.right;
        ArrayList<Integer> tmp = new ArrayList<Integer>();
        while (current != null) {
            if (!isLeaf(current)) {
                tmp.add(current.data);
            }
            if (current.right != null) {
                current = current.right;
            } else {
                current = current.left;
            }
        }

        for (int i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
    }


    class Node {
        int data;
        Node left, right;

        Node(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
