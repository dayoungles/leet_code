package leet;

public class ReverseInteger {
    public int reverse(int x) {

        boolean negative = false;
        if (x < 0 ) {
            negative = true;
            x= -x;
        }
        String temp= new StringBuilder(String.valueOf(x)).reverse().toString();

        if (negative) {
            temp = "-" + temp;
        }
        try {
            return Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            return 0;
        }







    }
}
