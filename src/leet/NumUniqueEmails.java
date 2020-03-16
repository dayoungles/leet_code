package leet;

import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        if (emails.length < 1 ) return emails.length;
        Set<String> hset = new HashSet<>();
        StringBuffer sb = new StringBuffer();

        for (String email :
                emails) {
            sb.delete(0, sb.length());
            String[] parts = email.split("@");

            String withoutPlus= parts[0].split("\\+")[0];
            sb.append(withoutPlus.replace(".", ""));
            sb.append("a");
            sb.append(parts[1]);
            hset.add(sb.toString());

        }

        return hset.size();
    }
}
