//Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.

public class RemoveDuplicateFromSortedList {

    public static void main(String[] args) {

        ListNode list = new ListNode(1);
        list.next = new ListNode(1);
        list.next.next = new ListNode(2);

        list = deleteDuplicates(list);

        printList(list);

    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
