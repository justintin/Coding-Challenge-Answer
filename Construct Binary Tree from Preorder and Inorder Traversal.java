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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildtree(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode buildtree(int[] preorder, int ps, int pe, int[] inorder, int is, int ie){
        if(ps>pe||is>ie){return null;}
        int rootval = preorder[ps];
        TreeNode root = new TreeNode(rootval);
        for(int i=is;i<=ie;i++){
            if(inorder[i]==rootval){
                TreeNode left = buildtree(preorder,ps+1,i-is+ps,inorder,is,i-1);
                TreeNode right = buildtree(preorder,i-is+ps+1,pe,inorder,i+1,ie);
                root.left=left;
                root.right=right;
            }
        }
        return root;
    }
}
