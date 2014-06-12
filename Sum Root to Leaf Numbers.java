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
    int res=0;
    public int sumNumbers(TreeNode root) {
       if(root==null){return 0;}
       sum(root);
       return res;
    }
    public void sum(TreeNode root){
        if(root.left==null&&root.right==null){res+=root.val;}
        if(root.left!=null&&root.right==null){root.left.val+=root.val*10;sum(root.left);}
        if(root.left==null&&root.right!=null){root.right.val+=root.val*10;sum(root.right);}
        if(root.left!=null&&root.right!=null){
        root.left.val+=root.val*10;
        root.right.val+=root.val*10;
        sum(root.left);
        sum(root.right);
        }
        
    }
}
