package leet;

import leet.model.ListNode;
import org.junit.Before;
import org.junit.Test;


public class AddTwoNumbersTest {
    AddTwoNumbers atn;
    ListNode a = new ListNode(2);
    ListNode b = new ListNode(4);
    ListNode c = new ListNode(3);


    ListNode d = new ListNode(5);
    ListNode e = new ListNode(6);
    ListNode f = new ListNode(4);

    @Before
    public void setup() {
        atn = new AddTwoNumbers();
        a.next = b;
        b.next = c;
        d.next = e;
        e.next = f;
    }

    @Test
    public void addTwoNumbers20210915() {
        ListNode x = atn.addTwoNumbers20210915(a,d);
        System.out.println(x.val);
        System.out.println(x.next.val);
        System.out.println(x.next.next.val);


    }
    @Test
    public void addTwoNumbers0904() {
        System.out.println(atn.addTwoNumbers20200904(a, d));

    }

    @Test
    public void test_0() {

        a = new ListNode(0);

        d = new ListNode(0);
        e = new ListNode(9);
        f = new ListNode(9);

        d.next = e;
        e.next = f;
        System.out.println(atn.addTwoNumbers20200904(a, d));
    }

    @Test
    public void test_long_list() {
        a = new ListNode(9);

        d = new ListNode(9);
        e = new ListNode(9);
        f = new ListNode(9);
        d.next = e;
        e.next = f;
        atn.addTwoNumbers20210915(a, d);
    }
    @Test
    public void test_long_list_with_olim() {
        a = new ListNode(9);

        d = new ListNode(9);
        e = new ListNode(9);
        f = new ListNode(1);
        d.next = e;
        e.next = f;
        ListNode n = atn.addTwoNumbers20200904(a, d);
        while(n.next != null) {
            System.out.println(n.val);
            n= n.next;
        }
    }
}