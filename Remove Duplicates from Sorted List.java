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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode p1,p2;
        if(head==null){return head;}
        else{
            p1=head;
            p2=p1;
            //head.next;
            while(p2!=null){
               p2=p2.next;
               if(p2==null){p1.next=null;return head;}
               else{
               if(p2.val!=p1.val){p1.next=p2;p1=p1.next;}    
                }
            }
            return head;
        }
    }
}
