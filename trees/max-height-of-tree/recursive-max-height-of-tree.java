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
    int maxHeight =0 ;
    public int maxDepth(TreeNode root) {
        return traverse(root);

    }

    int traverse(TreeNode node){
        if(node == null)return 0; //base condition
         maxHeight =  1 + Math.max(traverse(node.left),traverse(node.right));
         return maxHeight;
    }
}