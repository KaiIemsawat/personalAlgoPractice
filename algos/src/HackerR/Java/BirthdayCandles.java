package HackerR.Java;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCandles {

    public static void main(String[] args) {
        List<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);
    }

    public static int birthdayCakeCandles(List<Integer> candles) {
        int count = 0;
        int height = 0;

        for (int i : candles) {
            if (i > height) {
                height = i;
                count = 1;
            }
            else if (i == height) {
                count++;
            }
        }

        return count;
    }
}
