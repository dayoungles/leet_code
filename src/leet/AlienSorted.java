package leet;

import java.util.LinkedList;

public class AlienSorted {
    public boolean isAlienSorted(String[] words, String order) {
        if(words == null) return false;
        if(order == null) return false;
        if(words.length == 1) return true;

        LinkedList<Character> order_character = new LinkedList<>();
        for(int i = 0; i< order.length(); i++){
            order_character.add(order.charAt(i));
        }

        search: for (int i = 0; i< words.length-1; i++){
            String first =words[i];
            String second = words[i+1];
            int idx = 0;

            while(idx <= first.length()&& idx <= second.length()){
                char f = first.charAt(idx);
                char s = second.charAt(idx);
                if( order_character.indexOf(f) < order_character.indexOf(s)) {
                    continue search;
                } else if(order_character.indexOf(f) > order_character.indexOf(s)) {
                    return false;
                } else {
                    idx++;
                    if(second.length() == idx) return false;
                }
            }
        }

        return true;
    }
}
