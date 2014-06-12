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
    	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        if(l1==null&&l2==null) return new ListNode(0);
        ListNode head = new ListNode(0);
        ListNode res = head;
        int carry=0;
        while(l1!=null&&l2!=null){
            int sum=(l1.val+l2.val+carry)%10;
             res.next = new ListNode(sum);
             carry=(l1.val+l2.val+carry)/10;
             l1=l1.next;
             l2=l2.next;
             res=res.next;
        }
        if(l1!=null){
            if(carry!=0){res.next=addTwoNumbers(l1,new ListNode(carry));}
            else{res.next=l1;}}
        else if(l2!=null){
            if(carry!=0){res.next=addTwoNumbers(l2,new ListNode(carry));}
            else{res.next=l2;}}
        else if(carry!=0){res.next=new ListNode(carry);}
        return head.next;
        }

}
