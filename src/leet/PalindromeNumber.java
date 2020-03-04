package leet;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        String strX = Integer.toString(x);
        for(int i =0; i< strX.length()/2;i++){
            char head = strX.charAt(i);
            char tail = strX.charAt(strX.length()-i-1);
            if(i == strX.length()-i -1) {
                return true;
            }

            if(head == tail) {
                continue;
            } else {
                return false;
            }
        }
        return true;

    }
}
