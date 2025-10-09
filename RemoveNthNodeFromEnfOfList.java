// Es 19 - Given the head of a linked list, remove the nth node from the end of the list and return its head.

public class RemoveNthNodeFromEnfOfList {
    public static void main(String[] args) {
        int n = 2;
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode result = removeNthFromEnd(head, n);
        printList(result);
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fast = dummy;
        ListNode slow = dummy;

        int movefast = n + 1;
        while (movefast > 0) {
            fast = fast.next;
            movefast--;
        }
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;

        }
        slow.next = slow.next.next;
        return dummy.next;
    }

    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) {
                System.out.print(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }
}
