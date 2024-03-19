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
    public boolean isSameTree(TreeNode p, TreeNode q) {
      if(p == null || q == null) return (p==q);
      return p.val==q.val && isSameTree(p.left, q.left) && isSameTree(p.right,q.right);
    }
}

// The time complexity of the provided solution is O(N), where N is the number of nodes in the smaller of the two trees (since we traverse each node once).

// The space complexity of the provided solution is also O(N) in the worst case scenario. This is because the space required for the recursive calls in the call stack is proportional to the height of the tree, and in the worst case, the tree could be skewed, leading to a height of N, where N is the number of nodes in the tree.