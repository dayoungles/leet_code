package leet;

public class LongestPalindrome {
    int low, maxlen;
    public String longestPalindrome(String s) {
        int len = s.length();

        if(len<2) {
            return s;
        }

        for (int i = 0; i < len - 1; i++) {
            extendIdx(s, i, i);
            extendIdx(s, i, i + 1);

        }
        return s.substring(low, low+maxlen);

    }

    private void extendIdx(String s, int j, int k) {
        while(j >= 0 && k< s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if(maxlen < k-j-1) {
            low = j +1;
            maxlen = k - j - 1;
        }
    }

}
