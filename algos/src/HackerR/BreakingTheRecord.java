package HackerR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BreakingTheRecord {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1));

        System.out.println(breakingRecords(input));
    }

    public static List<Integer> breakingRecords(List<Integer> scores) {
        int hi = scores.get(0);
        int hiCount = 0;
        int low = scores.get(0);
        int lowCount = 0;

        for (int i = 1; i< scores.size(); i++) {
            if (scores.get(i) > hi) {
                hi = scores.get(i);
                hiCount++;
            }
            else if (scores.get(i) < low) {
                low = scores.get(i);
                lowCount++;
            }
        }

        return new ArrayList<>(Arrays.asList(hiCount, lowCount));
    }
}
