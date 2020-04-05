package leet;

public class AddStrings {
    public String addStrings(String num1, String num2) {
        int len1 = num1.length();
        int len2 = num2.length();
        int idx1 = 0, idx2 = 0;
        int ollim = 0;
        StringBuffer sb = new StringBuffer();

        while (len1 > idx1 || len2 > idx2 || ollim > 0) {
            int val1 = 0;
            int val2 = 0;

            if(idx1 < len1) {
                val1 = Integer.parseInt(String.valueOf(num1.charAt(len1-1-idx1)));
            }

            if(idx2 < len2) {
                val2 = Integer.parseInt(String.valueOf(num2.charAt(len2-1-idx2)));
            }

            int sum = val1+val2 + ollim;
            ollim = 0;

            if (sum >= 10) {
                ollim = sum / 10;
                sum = sum % 10;
            }
            sb.append(sum);
            ++idx1;
            ++idx2;
        }

        return sb.reverse().toString();
    }
}
