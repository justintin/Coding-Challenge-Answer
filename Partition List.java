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
    public ListNode partition(ListNode head, int x) {
        if(head==null) return head;
        ListNode sm = new ListNode(0);
        ListNode la = new ListNode(0);
        
        ListNode cur = head;
        ListNode sp = sm;
        ListNode lp = la;
       
        while(cur!=null){
            if(cur.val<x){
                sp.next=cur;
                cur=cur.next;
                sp=sp.next;
                sp.next=null;
                }
            else if(cur.val>=x){
                lp.next=cur;
                cur=cur.next;
                lp=lp.next;
                lp.next=null;
                }
        }
        if(sm.next!=null){sp.next=la.next;return sm.next;}
        else{return la.next;}
        }
}
