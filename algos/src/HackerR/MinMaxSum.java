package HackerR;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxSum {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();

        arr.add(1);
        arr.add(3);
        arr.add(5);
        arr.add(7);
        arr.add(9);

        miniMaxSum(arr);

    }

    public static void miniMaxSum(List<Integer> arr) {
        if (arr.size() == 1) {
            System.out.println(arr.get(0) +" "+ arr.get(0));
        }


        long min = Collections.min(arr);
        long max = Collections.max(arr);
        long total = 0;

        for (long i : arr) {
            total += i;
        }

        System.out.println((total-max) + " " + (total-min));
    }
}
