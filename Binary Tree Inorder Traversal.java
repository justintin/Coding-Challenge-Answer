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
    public ArrayList<Integer> res = new ArrayList<Integer>();
    public ArrayList<Integer> inorderTraversal(TreeNode root) {
        inorder(root);
        return res;
    }
    public void inorder(TreeNode root){
        if(root==null){return;}
        inorder(root.left);
        res.add(root.val);
        inorder(root.right);
    }
}
