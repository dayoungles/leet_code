package leet;

public class PassingCars {
    public int solution (int[] A) {
        int sum = 0;
        int count = 0;
        for(int n : A) {
            sum += n;
        }

        for(int n: A) {
            if(n == 0) {
                count+= sum;

            } else if(n == 1){
                sum--;
            }
        }
        if(count>1000000000) {
            return -1;
        }
        return count;
    }

}
