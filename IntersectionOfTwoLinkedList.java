/*Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. 
If the two linked lists have no intersection at all, return null. */

public class IntersectionOfTwoLinkedList {
    public static void main(String[] args) {
        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next = new ListNode(1);
        headB.next.next = common;

        ListNode IntersectionNode = getIntersectionNode(headA, headB);
        printNode(IntersectionNode);
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            pointerA = (pointerA != null) ? pointerA.next : headB;
            pointerB = (pointerB != null) ? pointerB.next : headA;

        }
        return pointerA;
    }

    public static void printNode(ListNode node) {
        if (node != null) {
            System.out.println("Intersected at '" + node.val + "'");
        } else {
            System.out.println("No intersection");
        }
    }
}
