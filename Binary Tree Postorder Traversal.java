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
    ArrayList<Integer> post =new ArrayList<Integer>();
    public ArrayList<Integer> postorderTraversal(TreeNode root) {
        postorder(root);
        return post;
    }
    public void postorder(TreeNode root){
      if(root==null){return;}
      postorder(root.left);
      postorder(root.right);
      post.add(root.val);
    }
}
