package leet;

import leet.model.ListNode;

import java.util.ArrayList;

public class AddTwoNumbers {

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

