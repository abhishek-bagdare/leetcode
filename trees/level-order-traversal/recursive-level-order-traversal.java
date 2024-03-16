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
           List<List<Integer>> result ;
    public List<List<Integer>> levelOrder(TreeNode root) {
            result = new ArrayList<>();
       if(root == null) return result;
        traverse( root, 0);
        return result;
    }

    void traverse(  TreeNode node, int level){
 
       
        if (result.size() == level){
            result.add(new ArrayList<Integer>());
        }
         List<Integer> sublist = result.get(level);
        sublist.add(node.val);
        if(node.left!=null) traverse( node.left, level+1);
        if(node.right!=null) traverse(node.right, level+1);

    }
}