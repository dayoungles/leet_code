package leet;

import leet.model.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTwoListsTest {
    @Test
    public void test_mergetwolist() {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        MergeTwoLists a = new MergeTwoLists();
        a.mergeTwoLists(l1, l2);
    }

}