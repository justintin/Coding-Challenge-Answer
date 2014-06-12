/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
       	if (head == null)
			return head;
		RandomListNode cur = head;
		while (cur != null) {
			RandomListNode newNode = new RandomListNode(cur.label);
			newNode.next = cur.next;
			cur.next = newNode;
			cur = newNode.next;
		}
		cur = head;
		while (cur != null) {
			if (cur.random != null) {
				cur.next.random = cur.random.next;
			}
			cur = cur.next.next;
		}
		cur = head.next;
		RandomListNode newHead = cur;
		RandomListNode old = head;
		while (old != null) {
			old.next = old.next.next;
			if (old.next != null) {
				cur.next = old.next.next;
			}
			cur = cur.next;
			old = old.next;
		}
		return newHead;

    }
}
