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
    public ArrayList<ArrayList<Integer>> levelOrder(TreeNode root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<TreeNode>> resnode = new ArrayList<ArrayList<TreeNode>>();
        if(root==null) return res;
        ArrayList<TreeNode> curnode=new ArrayList<TreeNode>();
        curnode.add(root);
        ArrayList<Integer> cur = new ArrayList<Integer>();
        cur.add(root.val);
        while(!cur.isEmpty()){
            ArrayList<TreeNode> nextnode=new ArrayList<TreeNode>();
            ArrayList<Integer> next= new ArrayList<Integer>();
            for(TreeNode s: curnode){
                if(s.left!=null){next.add(s.left.val);nextnode.add(s.left);}
                if(s.right!=null){next.add(s.right.val);nextnode.add(s.right);}
            }
            res.add(cur);
            //if(next.isEmpty()){break;}
            cur=next;
            curnode=nextnode;
        }
        
        return res;
    }
}
