package leet;

import java.util.HashSet;
import java.util.Set;

public class NumUniqueEmails {
    public int numUniqueEmails(String[] emails) {
        if (emails.length < 1 ) return emails.length;
        Set<String> hset = new HashSet<>();

        for (String email :
                emails) {
            String[] parts = email.split("@");
            String domain = parts[1];
            String withoutPlus= parts[0].split("\\+")[0];
            hset.add(withoutPlus.replace(".", "")+"@"+domain);
        }

        return hset.size();
    }
}
