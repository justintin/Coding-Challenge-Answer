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
    public int minDepth(TreeNode root) {
        int i=0;
        if(root==null){return 0;}
        else{
            if(root.left==null){return i=minDepth(root.right)+1;}
            else{
                if(root.right==null){return i=minDepth(root.left)+1;}
                else{ return   i=min(minDepth(root.left),minDepth(root.right))+1;}
            }
         
        }
        //return i;
    }
    public int min(int a, int b){
        if(a<=b){return a;}
        else{return b;}
    } 
}
