package HackerR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleOrange {
    public static void main(String[] args) {
        int s = 7;
        int t = 11;
        int a = 5;
        int b = 15;
        List<Integer> apples = new ArrayList<>(Arrays.asList(-2, 2, 1));
        List<Integer> oranges = new ArrayList<>(Arrays.asList(5, -6));

        countApplesAndOranges(s,t,a,b,apples, oranges);
    }

    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        int countA = 0;
        int countB = 0;

        for (int i = 0; i< apples.size(); i++) {
            if (apples.get(i) + a >= s && apples.get(i) + a <=t ) {
                countA++;
            }
        }
        for (int i = 0; i< oranges.size(); i++) {
            if (oranges.get(i) + b <= t && oranges.get(i) + b >= s) {
                countB++;
            }
        }
        System.out.println(countA);
        System.out.println(countB);
    }
    
}
