package HackerR;

import java.util.Arrays;
import java.util.List;

public class SubarryDivision {

    public static void main(String[] args) {
        List<Integer> s = Arrays.asList(1, 2, 1, 3, 2);
        int d = 3;
        int m = 2;

        System.out.println(birthday(s, d, m));
    }

    public static int birthday(List<Integer> s, int d, int m) {
        // Write your code here
        int count = 0;

        for (int i = 0; i < s.size() - m + 1; i++) {
            int temp = 0;
            for (int j = i; j <= i + m - 1; j++) {
                temp = temp + s.get(j);
            }
            if (temp == d) count++;
        }
        return count;
    }
}
