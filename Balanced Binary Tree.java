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
    public boolean isBalanced(TreeNode root) {
        return Balance(root)>=0? true: false;
    }
    private int Balance(TreeNode root){
        if(root==null){return 0;}
        else{
            int left=Balance(root.left);
            int right=Balance(root.right);
            if( left<0||right<0||Math.abs(left - right) > 1){return -1;}
            return Math.max(left,right)+1;
        }
    }
}
