package leet;

public class CheckInclusion {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        if(s1.length() == s2.length() && s1.contains(s2)) return true;

        
        return false;
    }
}
