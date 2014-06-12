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
    public ListNode rotateRight(ListNode head, int n) {
        if(head==null){return null;}
        //if(n==0){return head;}
        ListNode check = head;
        int num=1;
        int pace;
        while(check.next!=null){check=check.next;num++;}
        check.next=head;
        pace = num-(n%num);
        while(pace!=0){
            head=head.next;
            check=check.next;
            pace--;
        }
        check.next=null;
        return head;
    }
}
