package HackerR;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1,4,4,4,5,3);

        System.out.println(migratoryBirds(input));
    }

    public static int migratoryBirds(List<Integer> arr) {
        // Write your code here
        int[] birds = new int[5];

        for (int i = 0; i< arr.size(); i++) {
            birds[arr.get(i) - 1]++;
        }

        int max = 0;
        int index = 0;

        for (int i = 0; i < 5; i++) {
            if (birds[i] > max) {
                max = birds[i];
                index = i;
            }
        }
        return index + 1; // because index starts at 0.
    }
}
