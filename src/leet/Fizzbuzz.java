package leet;

import java.util.ArrayList;
import java.util.List;

public class Fizzbuzz {
    public List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 0; i< n; i++){
            String a = "";

            if(i%3 == 0 ){
                a+= "Fizz";
            }

            if(i%5 == 0){
                a+="Buzz";
            }

            if(a.equals("")){
                System.out.println(i);
                result.add(String.valueOf(i));
            } else {
                System.out.println(a);
                result.add(a);
            }
        }

        return result;
    }
}
