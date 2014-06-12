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
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode dummy =  new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        ListNode p1=null;
        ListNode p2=null;
        for(int i=0;i<m-1;i++){slow=slow.next;}
        p1=slow;
        slow=slow.next;
        for(int i=0;i<n;i++){fast=fast.next;}
        p2=fast.next;
        fast.next=null;
        p1.next=reverse(slow);
        while(p1.next!=null){p1=p1.next;}
        p1.next=p2;
        return dummy.next;
        
    }
    private ListNode reverse(ListNode head){
        ListNode cur=head;
        ListNode prev=null;
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
