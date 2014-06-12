/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public void reorderList(ListNode head) {
        if(head==null||head.next==null) return;
        ListNode dummy = new ListNode(0);
        dummy.next=head;
        ListNode slow=dummy;
        ListNode fast=dummy;
        while(fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        ListNode mid=slow.next;
        slow.next=null;
        fast=reverse(mid);
        slow=head;
        while(fast!=null){
            ListNode cur=slow;
            slow=slow.next;
            cur.next=fast;
            cur=cur.next;
            fast=fast.next;
            cur.next=slow;
        }
        
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
