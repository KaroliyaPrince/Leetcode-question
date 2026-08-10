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
        List<Integer> ans = new ArrayList<Integer>();
        InOrderTraversal(ans,root);
        return ans;
    }

    public void InOrderTraversal(List<Integer> ans,TreeNode node){

        if(node == null){
            return;
        }

        InOrderTraversal(ans,node.left);
        ans.add(node.val);
        InOrderTraversal(ans,node.right);
    }
}