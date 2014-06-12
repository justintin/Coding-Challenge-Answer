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
    public ListNode insertionSortList(ListNode head) {
        if(head==null||head.next==null){return head;}
        ListNode dummy = new ListNode(0);
        dummy.next=null;
        ListNode new_next;  
        ListNode pre,next; 
        while(head!=null) {  
            next = head.next;  
            pre  = searchForInsertPos(dummy,head.val);  
            new_next = pre.next;  
            head.next = new_next;  
            pre.next  = head;  
            head = next;  
        }  
        return dummy.next; 
        
    }
    public ListNode searchForInsertPos(ListNode head, int val) {  
        ListNode pre  = head;  
        ListNode next = head.next;  
        while(next!=null&&next.val<=val) {  
            pre  = next;  
            next = next.next;  
        }  
        return pre;  
    }  
}
