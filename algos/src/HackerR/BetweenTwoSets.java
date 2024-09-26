package HackerR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSets {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(2, 4));
        List<Integer> b = new ArrayList<>(Arrays.asList(16, 32, 96));

        System.out.println(getTotalX(a, b));

    }

    public static int getTotalX(List<Integer> a, List<Integer> b) {

        int res = 0;

        // Get LCM of all elements from 'a'
        int lcm = a.get(0);
        for (Integer i : a ) {
            lcm = getLcm(lcm, i);
        }

        // Get GCD of all element from 'b'
        int gcd = b.get(0);
        for (Integer i : b) {
            gcd = getGCD(gcd, i);
        }

        int multiple = 0;
        while (multiple <= gcd) {
            multiple += lcm;

            if (gcd % multiple == 0) res++;
        }

        return res;
    }

    private static int getGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGCD(n2, n1%n2);
    }

    private static int getLcm(int n1, int n2) {
        if (n1 == 0 || n2 == 0) {
            return 0;
        }
        else {
            int gcd = getGCD(n1, n2);
            return Math.abs(n1 * n2) / gcd;
        }
    }

}
