package leet;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaxProfitTest {

    @Test
    public void maxProfit20191230(){
        MaxProfit p = new MaxProfit();
        int[] a = {7,6,4,3,1};
        System.out.println(p.maxProfit20191230(a));
    }
    @Test
    public void maxProfit() {
        MaxProfit p = new MaxProfit();
        int[] a = {2,4,1};
        System.out.println(p.maxProfit(a));
    }
}