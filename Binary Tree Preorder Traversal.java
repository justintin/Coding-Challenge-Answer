/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    ArrayList<Integer> res = new ArrayList<Integer>();
    public ArrayList<Integer> preorderTraversal(TreeNode root) {
        preorder(root);
     return res;
    }
    public void preorder(TreeNode root){
        if(root==null){return;}
        res.add(root.val);
        preorder(root.left);
        preorder(root.right);
        return;
    }
}
