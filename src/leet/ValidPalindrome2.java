package leet;

public class ValidPalindrome2 {
    public boolean validPalindrome(String s ){
        boolean isDeleted = false;
        int headIdx = 0;
        int tailIdx = s.length()-1;

        while(headIdx <=tailIdx){
            char head = s.charAt(headIdx);
            char tail = s.charAt(tailIdx);

            if(headIdx == tailIdx) {
                return true;
            }

            if(head == tail) {
                headIdx++;
                tailIdx--;
            } else if(!isDeleted){
                tailIdx--;
                isDeleted = true;
            } else {
                return false;
            }
        }

        return true;
    }
}
