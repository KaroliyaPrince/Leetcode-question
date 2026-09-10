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

    int ans = 0;
    int sum = 0;
    int n = 0;

    public int averageOfSubtree(TreeNode root) {
        getCount(root);

        return ans;
    }

    void getCount(TreeNode root){

        if(root == null) return;

        traversTree(root);

        if(root.val == sum/n) ans++;

        sum = 0;
        n = 0;
        getCount(root.left);
        getCount(root.right);

    }

    void traversTree(TreeNode root){
        if(root == null){
            return;
        }

        traversTree(root.left);
        sum += root.val;
        n++;
        traversTree(root.right);
    }
}