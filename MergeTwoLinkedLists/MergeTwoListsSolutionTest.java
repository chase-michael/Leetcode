import org.junit.Test;

import java.util.Arrays;

public class MergeTwoListsSolutionTest {
    @Test
    public void mergeTwoLists() {
        /* Sample arrays */
        int[] list1 = new int[] {1, 2, 4, 6, 8};
        int[] list2 = new int[] {2, 3, 3, 90};

        /* Convert sample arrays to LinkedList as per solution */
        ListNode l1 = new ListNode(list1[0]);
        ListNode ll1 = l1;
        for (int i = 1; i < list1.length; i++) {
            ll1.next = new ListNode(list1[i]);
            ll1 = ll1.next;
        }

        ListNode l2 = new ListNode(list2[0]);
        ListNode ll2 = l2;
        for (int i = 1; i < list2.length; i++) {
            ll2.next = new ListNode(list2[i]);
            ll2 = ll2.next;
        }

        /* Run method and convert to array */
        ListNode result = MergeTwoListsSolution.mergeTwoLists(l1, l2);
        int[] actual = new int[list1.length+list2.length];
        for (int i = 0; i < actual.length; i++) {
            actual[i] = result.val;
            result = result.next;
        }

        /* Output validation */
        int[] expected = new int[] {1, 2, 2, 3, 3, 4, 6, 8, 90};

        System.out.println("Expected: " + Arrays.toString(expected));
        System.out.println("Actual: " + Arrays.toString(actual));
        System.out.println("Pass: " + Arrays.equals(expected, actual));
    }

}
