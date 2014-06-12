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
    public ListNode mergeKLists(ArrayList<ListNode> lists) {
        if(lists==null || lists.size()==0) return null;
        Comparator<ListNode> com = new Comparator<ListNode>(){
             public int compare(ListNode a, ListNode b)
            {
                return a.val-b.val;
            }
            
        };
        
        
        PriorityQueue<ListNode> pq=new PriorityQueue<ListNode>(lists.size(),com); 
        for(ListNode node : lists)
        {
            if(node!=null)
                pq.add(node);
        }
            
        ListNode head=new ListNode(0);
        ListNode p=head;
        
        while(!pq.isEmpty())
        {
            ListNode node=pq.poll();
            if(node.next!=null)
                pq.add(node.next);
            p.next=node;
            p=p.next;
        }
        
        return head.next;
        
        
    }
}
