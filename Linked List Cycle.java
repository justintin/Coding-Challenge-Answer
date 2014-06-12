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
    public boolean hasCycle(ListNode head) {
        try{
        ListNode runner1 = head.next;
        ListNode runner2 = head.next.next;
        runner1=head.next;
        runner2=head.next.next;
        while(runner1!=null|runner2!=null){
         if(runner1.val==runner2.val)return true;
         runner1=runner1.next;
         runner2=runner2.next.next;
        }
       }catch(Exception e){
           return false;
       }
        return false;
    }
}
