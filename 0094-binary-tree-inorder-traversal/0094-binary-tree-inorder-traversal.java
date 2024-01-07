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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        inorderTraversalRecursive(root, result);
        
        return result;
    }
    
    private void inorderTraversalRecursive(TreeNode root, List<Integer> result) {
        if(root == null) {
            return;
        } else {
            inorderTraversalRecursive(root.left, result);
            result.add(root.val);
            inorderTraversalRecursive(root.right, result);
        }
    }
}