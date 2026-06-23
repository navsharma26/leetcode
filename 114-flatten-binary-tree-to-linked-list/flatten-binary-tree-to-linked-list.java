/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void flatten(TreeNode root) {
        if(root == null) return;

        TreeNode leftTree = root.left;
        TreeNode rightTree = root.right;

        flatten(leftTree);
        flatten(rightTree);

        if(leftTree != null){
            TreeNode temp = leftTree;

            while(temp.right != null){
                temp = temp.right;
            }

            temp.right = rightTree;
            root.right = leftTree;
            root.left = null;
        }
    }
}