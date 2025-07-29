// Given the root of a binary tree, return the postorder traversal of its nodes' values.

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePostorderTraversal {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(postorderTraversal(root));
    }

    public static List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> postOrderedTree = new ArrayList<>();
        traverse(root, postOrderedTree);
        return postOrderedTree;
    }

    private static void traverse(TreeNode root, List<Integer> postOrderedTree) {
        if (root == null)
            return;

        traverse(root.left, postOrderedTree);
        traverse(root.right, postOrderedTree);
        postOrderedTree.add(root.val);
    }
}
