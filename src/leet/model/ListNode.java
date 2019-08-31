package leet.model;

public class ListNode {
    int val;
    ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public int getVal(){
        return val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }
}
