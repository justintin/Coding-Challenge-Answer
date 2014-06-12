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
    public int maxDepth(TreeNode root) {
        int i=0;
        if(root==null){return 0;}
        else{
            
             i=max(maxDepth(root.left),maxDepth(root.right))+1;
        }
        return i;
    }
    public int max(int a, int b){
        if(a>=b){return a;}
        else{return b;}
    } 
}
