package leet;

public class IsPalindrome {
    public boolean isPalindrome(String s) {
        if(s == null) return true;
        if(s.equals("")) return true;

        int pos1 = 0;
        int pos2 = s.length()-1;

        while(pos1 <= pos2){
            while ( pos1 <= pos2 &&!Character.isLetterOrDigit(s.charAt(pos1)) ){
                pos1++;
            }

            while (pos1<= pos2 &&!Character.isLetterOrDigit(s.charAt(pos2)) ){
                pos2--;
            }


            if(pos1 <= pos2 && Character.toLowerCase(s.charAt(pos1))!= Character.toLowerCase(s.charAt(pos2))) {
                return false;
            }

            pos1++;
            pos2--;
        }

        return true;

    }
}
