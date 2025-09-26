/*Given the head of a linked list and an integer val, 
remove all the nodes of the linked list that has Node.val == val, and return the new head. */

public class RemoveLinkedListElements {
    public static void main(String[] args) {

        int[] values = { 1, 2, 3, 6, 7, 4 };
        ListNode head = new ListNode(values[0]);
        ListNode current = head;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
        }

        int val = 6;

        ListNode nodeWoElements = removeElements(head, val);
        printNode(nodeWoElements);
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;

    }

    public static void printNode(ListNode node) {
        if (node != null) {
            System.out.println("The head of the ListNode is " + node.val);
        } else {
            System.out.println("[]");
        }
    }
}
