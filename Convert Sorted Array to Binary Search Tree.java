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
    public TreeNode sortedArrayToBST(int[] num) {
        if(num==null||num.length==0) return null;
        int min=0;
        int max=num.length-1;
        return makeBST(num,min,max);
        
    }
    public TreeNode makeBST(int[] num, int min,int max){
        if(min>max) return null;
       
        int mid = (max-min)/2+min;
        //root.val=num[mid];
         TreeNode root = new TreeNode(num[mid]);
        root.left=makeBST(num,min,mid-1);
        root.right=makeBST(num,mid+1,max);
        return root;
    }
}
