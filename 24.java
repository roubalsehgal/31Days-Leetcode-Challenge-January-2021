/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        
        for(ListNode node : lists) {
            while(node != null) {
                pq.add(node.val);
                node = node.next;
            }
        }
        ListNode curr = new ListNode(-1);
        ListNode head = curr;
        
        while(!pq.isEmpty()) {
            head.next = new ListNode(pq.poll());
            head = head.next;
        }
        return curr.next;
    }
}
