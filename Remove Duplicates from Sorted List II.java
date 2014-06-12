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
        if(head==null){return head;}
        ListNode start = new ListNode(0);
        ListNode cur = start;
        ListNode p1,p2;
        p1=head;
        p2=p1;
        while(p2!=null){
            p2=p1.next;
            if(p2==null||p1.val!=p2.val){
                cur.next=p1;
                cur=cur.next;
                p1=p2;
                cur.next=null;
                }
            else{p1=findNextDiff(p1);p2=p1;}
        }
        return start.next;
    }
    public ListNode findNextDiff(ListNode p1){
        ListNode tmp=p1;
        while(tmp!=null){
            if(tmp.val!=p1.val){return tmp;}
            tmp=tmp.next;
        }
        return null;
    }
}
