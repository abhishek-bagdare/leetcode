// The time complexity of the provided solution is O(N), where N is the number of nodes in the binary tree. This is because the traverse function visits each node in the tree exactly once.

// The space complexity of the provided solution is O(H), where H is the height of the binary tree. This is because the recursion depth of the traverse function is determined by the height of the binary tree. In the worst case scenario, where the tree is skewed, the recursion depth would be equal to the height of the tree.

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
   int sum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        traverse(root);
        return sum;
    }

    int traverse(TreeNode node){
        if(node == null)return 0;

        int left = Math.max(0,traverse(node.left));
        int right =  Math.max(0,traverse(node.right));
        int total = left + right + node.val;
        sum = Math.max(sum,total);
        return Math.max(left,right) + node.val;
    }
}