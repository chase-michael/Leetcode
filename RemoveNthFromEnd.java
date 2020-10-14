/**
 * Given the head of a linked list,
 * remove the nth node from the end
 * of the list and return its head.
 * https://leetcode.com/explore/interview/card/top-interview-questions-easy/93/linked-list/603/
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode temp = head;
        ListNode previous = null;
        ListNode temp2 = head;
        int i = n;

        if (head.next == null) {
            return null;
        }

        while (temp.next != null) {
            temp = temp.next;
            i--;
            if (i <= 0) {
                previous = temp2;
                temp2 = temp2.next;
            }
        }
        if (i > 0) {
            return temp2.next;
        }
        previous.next = temp2.next;
        return head;
    }
}