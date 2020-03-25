package leet;

public class RepeatedStringMatch {
    public int repeatedSTringMatch(String A, String B){
//        if(A.length() > B.length()) return -1;
        if ((A.length() == B.length()) && A.equals(B)) return 1;

        StringBuffer sb = new StringBuffer();
        sb.append(A);
        int count = 1;
        while(sb.length() < B.length()){
            sb.append(A);
            count++;
        }

        if(sb.length() == B.length() && sb.toString().equals(B)) {
            return count;
        }

        for (int i = 0; i < 2; i++) {
            if(sb.indexOf(B) != -1) {
                return count;
            }

            sb.append(A);
            count++;
        }

        if (sb.indexOf(B) == -1) {
            return -1;
        }

        return count;
    }
}
