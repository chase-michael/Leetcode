import java.util.LinkedList;

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
class MergeTwoListsSolution {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l2 == null) return l1;
        if (l1 == null) return l2;

        ListNode head;

        if (l1.val < l2.val) {
            head = new ListNode(l1.val);
            l1 = l1.next;
        } else {
            head = new ListNode(l2.val);
            l2 = l2.next;
        }

        ListNode temp = head;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                l1 = l1.next;
            } else if (l1.val > l2.val) {
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                l2 = l2.next;
            } else {
                temp.next = new ListNode(l1.val);
                temp = temp.next;
                temp.next = new ListNode(l2.val);
                temp = temp.next;
                l1 = l1.next;
                l2 = l2.next;
            }
        }

        while (l1 != null) {
            temp.next = new ListNode(l1.val);
            temp = temp.next;
            l1 = l1.next;
        }

        while (l2 != null) {
            temp.next = new ListNode(l2.val);
            temp = temp.next;
            l2 = l2.next;
        }

        return head;
    }
}