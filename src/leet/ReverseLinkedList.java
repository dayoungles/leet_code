package leet;

import leet.model.ListNode;

public class ReverseLinkedList {
    public ListNode reverse1230(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;

        ListNode newHead = new ListNode(0);
        newHead.next = null;
        ListNode tail = null;

        while(head!= null){
            ListNode tmp = head;
            head = head.next;

            ListNode newNext = newHead.next;
            newHead.next = tmp;
            tmp.next = newNext;
        }

        return newHead.next;
    }





    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;

        ListNode current = head;
        ListNode head2 = head.next;
        head.next = null;
        ListNode tmp;

        while(head2!= null) {
            tmp= head2.next;
            head2.next = current;
            current = head2;
            head2 = tmp;
        }

        return current;
    }
}
