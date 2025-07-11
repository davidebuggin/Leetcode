//Given the root of a binary tree, return the inorder traversal of its nodes' values.

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTrasversal {
    public static void main(String[] args) {

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println(inorderTraversal(root));
    }

    public static List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        if (root == null) {
            return list;
        }

        if (root.left != null) {
            list.addAll(inorderTraversal(root.left));
        }

        list.add(root.val);

        if (root.right != null) {
            list.addAll(inorderTraversal(root.right));
        }

        return list;
    }

}
