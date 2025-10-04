// Es 144 - Given the root of a binary tree, return the preorder traversal of its nodes' values.

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);
        System.out.println(preorderTraversal(root));

    }

    public static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorderedTree = new ArrayList<>();
        traverse(root, preorderedTree);
        return preorderedTree;

    }

    private static void traverse(TreeNode root, List<Integer> preorderedTree) {
        if (root == null)
            return;
        preorderedTree.add(root.val);
        traverse(root.left, preorderedTree);
        traverse(root.right, preorderedTree);
    }

}
