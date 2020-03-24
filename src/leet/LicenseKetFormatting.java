package leet;

import java.util.Stack;

public class LicenseKetFormatting {
    public String licenseKeyFormatting(String S, int K) {

        StringBuffer sb = new StringBuffer();
        int count = 0;
        for (int i = S.length()-1; i >=0; i--) {

            if (S.charAt(i) == '-'){
                continue;
            }

            if (count == K) {
                count = 0;
                sb.append('-');
            }
            sb.append(Character.toUpperCase(S.charAt(i)));
            count++;
        }

        if(sb.length() == 0) {
            return "";
        }

        return sb.reverse().toString();

    }
}
