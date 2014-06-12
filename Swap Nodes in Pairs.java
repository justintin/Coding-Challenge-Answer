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
    public ListNode swapPairs(ListNode head) {
        if(head==null) return null;
        else if(head.next==null) return head;
        else{
            ListNode iter = swapPairs(head.next.next);
            ListNode rev = head.next;
            rev.next=head;
            head.next=iter;
            return rev;
        }
    }
}
