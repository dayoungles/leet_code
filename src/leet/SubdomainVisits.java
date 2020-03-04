package leet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SubdomainVisits {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> res = new HashMap<>();

        for (int i = 0; i< cpdomains.length; i++) {
            String str = cpdomains[i];
            String[] line = str.split(" ");
            int count = Integer.valueOf(line[0]);
            String[] domains = line[1].split("\\.");
            String temp = "";
            for(int j = domains.length - 1;j >= 0;j--){
                temp = domains[j] + (temp.equals("") ? temp : "." + temp);
                if(!res.containsKey(temp)){
                    res.put(temp, count);
                }else{
                    res.put(temp, res.get(temp) + count);
                }
            }
        }


        List<String> answer = new ArrayList<>();
        for(String key: res.keySet()) {
            answer.add(res.get(key)+" "+ key);
        }

        return answer;
    }

}
