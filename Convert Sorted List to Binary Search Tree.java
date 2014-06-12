/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
      /*
        if(head==null) return null;
        ListNode tail;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        tail=dummy;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            tail=tail.next;
        }
        TreeNode root = new TreeNode(slow.val);
        tail.next=null;
        head=dummy.next;
        dummy.next=null;
        tail=slow;
        slow=slow.next;
        tail.next=null;
        
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(slow);
        return root;
     */
     if(head==null) return null;
        ListNode tail;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        tail=dummy;
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            tail=tail.next;
        }
        
        TreeNode root = new TreeNode(slow.val);
        if(slow==fast){return root;}
        tail.next=null;
        //head=dummy.next;
        dummy.next=null;
        tail=slow;
        slow=slow.next;
        tail.next=null;
        
        root.left=sortedListToBST(head);
        root.right=sortedListToBST(slow);
        return root;
    }
    
}
