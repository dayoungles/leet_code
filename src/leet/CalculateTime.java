package leet;

public class CalculateTime {
    public int calculateTime(String keyboard, String word) {
        int idx = 0;
        int count = 0;
        for (char alphabet: word.toCharArray()) {
            int newIdx = keyboard.indexOf(alphabet);
            count += Math.abs(newIdx - idx);
            idx = newIdx;
        }

        return count;

    }
}
