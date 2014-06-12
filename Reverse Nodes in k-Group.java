/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return head;
        int count=0;
        ListNode nextnode=head;
        ListNode curnode;
        ListNode endnode;
        
        curnode=nextnode;
            while(count!=k-1&&nextnode!=null){
                nextnode=nextnode.next;
                count++;
            }
            if(nextnode!=null){
                endnode=nextnode;
                nextnode=nextnode.next;
                endnode.next=null;
                
            head=reverse(curnode);
            curnode.next=reverseKGroup(nextnode, k);}
            return head;
        
    }
    public ListNode reverse(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        ListNode next=null;
        while(cur!=null){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
        }
        return prev;
    }
}
