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
    public void flatten(TreeNode root) {
       if(root==null)return;
       if(root.left!=null){
           TreeNode nextright = root.right;
           root.right=root.left;
           root.left=null;
           TreeNode rm=getrightmost(root.right);
           rm.right=nextright;
       }
       flatten(root.right);
      
    }
    public TreeNode getrightmost(TreeNode root){
        if(root.right==null) return root;
        return getrightmost(root.right);
    }
}
