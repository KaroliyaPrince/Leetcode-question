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
    int maxDepth;

    public int maxDepth(TreeNode root) {
        traverseTree(root,1);

        return maxDepth;
    }

    public void traverseTree(TreeNode root,int depth){

        if(root == null){
            depth--;
            maxDepth = Math.max(depth , maxDepth);
            return;
        }

        traverseTree(root.left , depth+1);
        traverseTree(root.right, depth+1);
    }
}