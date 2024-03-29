package leet;

import leet.model.ListNode;

import java.util.ArrayList;

public class AddTwoNumbers {

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
    public ListNode addTwoNumbers20210915(ListNode l1, ListNode l2) {
        if(l1 == null || l2 == null) return null;
        ListNode newHead = new ListNode(0);
        ListNode head = newHead;

        int olim = 0;
        while(l1!= null || l2 != null){
            int a = 0;
            int b = 0;

            if(l1!= null) {
                a = l1.val;
            }

            if(l2!= null) {
                b = l2.val;
            }

            int sum = a+b+olim;

            olim = sum / 10;
            int remain = sum % 10;

            newHead.next = new ListNode(remain);

            newHead = newHead.next;
            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }

        if(olim != 0) {
            newHead.next = new ListNode(olim);
        }

        return head.next;
    }

    public ListNode addTwoNumbers20200904(ListNode l1, ListNode l2){
        if(l1 == null || l2 == null) return null;
        int olim = 0;
        ListNode head = new ListNode(0);
        ListNode idx = head;
        while(l1 != null || l2 != null){
//            int olim2 = olim;
            int v1 = 0, v2 = 0;

            if(l1 != null) {
                v1 = l1.val;
            }
            if(l2 != null){
                v2 = l2.val;
            }

            int sum = v1 + v2 + olim;
            olim = sum / 10;
            int remain = sum % 10;

            idx.next = new ListNode(remain);
            idx = idx.next;

            if(l1 != null) {
                l1 = l1.next;
            }

            if(l2 != null) {
                l2 = l2.next;
            }
        }

        if(olim != 0){
            idx.next = new ListNode(olim);
        }
        return head.next;
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2){
//            예외조건
            /*


            3. 노드가 있는데 걍 0 cc
            4. 노드가 한자리수만 있고 나머지는 없는데 다른 노드는 연결이 되어있을 때
            5. 올림이 발생했는데 다음 노드가 없을 떄
             */
            int carry = 0;
            ListNode head = new ListNode(0);
            ListNode current = head;
            while (l1 != null || l2 != null) {
                int v1= (l1!= null) ? l1.val:0;
                int v2 = (l2!= null) ? l2.val:0;
                int sum = v1 + v2 + carry;

                carry = sum / 10;

                current.next = new ListNode(sum % 10);
                current = current.next;

                l1 = (l1 != null)? l1.next : null;
                l2 = (l2 != null)? l2.next : null;

            }
            if (carry != 0) {
                current.next= new ListNode(carry);
            }
            return head.next;
        }

//        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//            ListNode head = new ListNode(0);
//            ListNode currentL1 = l1;
//            ListNode currentL2 = l2;
//            ListNode currentNode = head;
//            int up = 0;
//
//            while(currentL1 != null || currentL2 != null) {
//
//                int v1 = (currentL1 != null) ? currentL1.val : 0;
//                int v2 = (currentL2 != null) ? currentL2.val : 0;
//
//                int currentVal = v1 + v2 + up;
//
//                up = currentVal / 10;
//                currentVal = currentVal % 10;
//
//                currentNode.next = new ListNode(currentVal);
//                currentNode = currentNode.next;
//
//                currentL1 = (currentL1 != null) ? currentL1.next : null;
//                currentL2 = (currentL2 != null) ? currentL2.next : null;
//
//
//            }
//            if (up != 0) {
//                currentNode.next = new ListNode(up);
//            }
//
//            return head.next;
//        }

    }



}

