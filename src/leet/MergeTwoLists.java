package leet;

import leet.model.ListNode;

public class MergeTwoLists {
        public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            if (l1 == null) return l2;
            if (l2 == null) return l1;

            ListNode head;
            ListNode tail;

            if(l1.val >= l2.val) {
                head = l2;
                l2 = l2.next;
            } else {
                head = l1;
                l1 = l1.next;
            }
            tail = head;

            while(l1 != null && l2 != null) {

                if (l1.val >= l2.val){
                    tail.next = l2;
                    l2 = l2.next;
                } else {
                    tail.next = l1;
                    l1 = l1.next;

                }
                tail = tail.next;
            }
            tail.next = (l1 == null)? l2:l1;
            return head;
        }

    public ListNode mergeTwoLists20200901(ListNode l1, ListNode l2) {
        if(l1 == null) return l2;
        if(l2 == null) return l1;

        ListNode head = new ListNode(-1);
        ListNode tail = head;
        while(l1 != null && l2 != null) {
            if(l1.val > l2.val) {
                tail.next = l2;
                tail = l2;
                l2 = l2.next;
            } else {
                tail.next = l1;
                tail = l1;
                l1 = l1.next;
            }
        }
        if(l1 == null) {
            tail.next = l2;
        }
        if(l2 == null) {
            tail.next = l1;
        }

        return head.next;
    }
}
