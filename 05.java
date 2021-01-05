/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode n = dummy;
        while (n.next != null && n.next.next != null) {
            if (n.next.val == n.next.next.val) {
                int duplicate = n.next.val;
                while (n.next != null && n.next.val == duplicate) {
                    n.next = n.next.next;
                }
            } else {
                n = n.next;
            }
        }
        return dummy.next;
    }
}
