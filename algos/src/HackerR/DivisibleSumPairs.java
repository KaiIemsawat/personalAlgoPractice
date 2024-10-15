package HackerR;

import java.util.Arrays;
import java.util.List;

public class DivisibleSumPairs {

    public static void main(String[] args) {
        List<Integer> input = Arrays.asList(1, 3, 2, 6, 1, 2);
        System.out.println(divisibleSumPairs(6, 3 , input));
    }

    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // Write your code here
        int count = 0;
        for (int i = 0; i <= n-2; i++) {
            for (int j = i + 1; j <= n-1; j++) {
                int value = (ar.get(i) + ar.get(j));
                if (value%k == 0)  {
                    count++;
                }
            }
        }
        return count;
    }
}
