package leet;

public class LongestPalindrome {
    public String longestPalindrome(String s) {

        if(s== null || s=="") return s;
        int minIdx = 0;
        int maxIdx = 0;
        int maxLen = 0;

        for(int i =0; i< s.length(); i++) {
            int len1 = extendOut(s,i, i);
            int len2 = extendOut(s,i, i+1);
            maxLen = (maxLen >= maxIdx-minIdx+1) ? maxLen : maxIdx-minIdx+1;
        }
        
        return null;

    }

    private int extendOut(String s, int i, int i1) {

        return 0;
    }
}
