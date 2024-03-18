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
       int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        int res = findHeight(root);
       return diameter;
    }
   int findHeight(TreeNode node){
        if(node == null)return 0;
        int left = findHeight(node.left);
        int right = findHeight(node.right);
        diameter = Math.max(diameter,left+right);
        return 1+Math.max(left,right);

        
    }
}

// The time complexity of the diameterOfBinaryTree function is O(n), where n is the number of nodes in the binary tree. This is because the function traverses each node once to compute the height of the subtree rooted at that node.

// The space complexity is also O(n), where n is the height of the binary tree. This is because the recursion depth can go up to the height of the tree, and at each level of recursion, additional space is required for the function call stack.