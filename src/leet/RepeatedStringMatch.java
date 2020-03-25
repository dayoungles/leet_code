package leet;

public class RepeatedStringMatch {
    public int repeatedSTringMatch(String A, String B){
//        if(A.length() > B.length()) return -1;
        if ((A.length() == B.length()) && A.equals(B)) return 1;
        StringBuilder sb = new StringBuilder();
//        StringBuffer sb = new StringBuffer();

        int count = 0;
        while(sb.length() < B.length()){
            sb.append(A);
            count++;
        }

        if(sb.indexOf(B) != -1) {
            return count;
        }

        if(sb.append(A).indexOf(B) != -1)
            return ++count;
////        if(sb.length() == B.length() && sb.toString().equals(B)) {
////            return count;
////        }
////
////        for (int i = 0; i < 2; i++) {
////            if(sb.indexOf(B) != -1) {
////                return count;
////            }
////
////            sb.append(A);
////            count++;
////        }
////
////        if (sb.indexOf(B) == -1) {
////            return -1;
////        }
//
        return -1;
    }
}
