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
   // boolean ini=false;
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root==null){return false;}
        else{if(root.left!=null&&root.right!=null){return hasPathSum(root.left, sum-root.val)? hasPathSum(root.left, sum-root.val):hasPathSum(root.right, sum-root.val);}
                else{ if(root.left!=null){return hasPathSum(root.left, sum-root.val);}
                        else{
                            if(root.right!=null){return hasPathSum(root.right, sum-root.val);}
                            else {return sum-root.val==0? true:false;}
                            
                }
            }
        }
    }
}