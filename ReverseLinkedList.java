// Given the head of a singly linked list, reverse the list, and return the reversed list.

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode reversedList = reverseList(head);
        printNode(reversedList);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    public static void printNode(ListNode node) {
        if (node != null) {
            System.out.println("The head of the ListNode is " + node.val);
        } else {
            System.out.println("[]");
        }
    }
}
