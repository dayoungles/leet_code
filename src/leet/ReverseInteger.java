package leet;

public class ReverseInteger {
    public int reverse(int x) {
        StringBuffer sb= new StringBuffer();
        sb.append(x);
        sb = sb.reverse();
        StringBuffer result = new StringBuffer();

        boolean isFirst = true;
        if(sb.charAt(sb.length()-1) == '-') {
            result.append('-');
            sb.deleteCharAt(sb.length() - 1);
        }

        for (int i = 0; i < sb.length(); i++){
            char thisTurn = sb.charAt(i);
            if (isFirst == true) {
                if (thisTurn == '0') {
                    continue;
                } else {
                    isFirst = false;
                }
            }

            result.append(thisTurn);
        }
        int res = Integer.parseInt(result.toString());

        return res;
    }
}
