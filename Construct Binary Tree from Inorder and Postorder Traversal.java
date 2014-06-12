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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return builtree(inorder,0,inorder.length-1,postorder,0,postorder.length-1);
    }
    public TreeNode builtree(int[] inorder, int is,int ie,int[] postorder,int ps,int pe){
        if(is>ie||ps>pe){return null;}
        int rootval = postorder[pe];
        TreeNode root = new TreeNode(rootval);
        for(int i=is;i<=ie;i++){
            if(inorder[i]==rootval){
                TreeNode left = builtree(inorder,is,i-1,postorder,ps,ps+i-is-1);
                TreeNode right = builtree(inorder,i+1,ie,postorder,ps+i-is,pe-1);
            root.left=left;
            root.right=right;
            }
        }
        return root;
    }
}


