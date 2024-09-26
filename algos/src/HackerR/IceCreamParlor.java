package HackerR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IceCreamParlor {
    public static void main(String[] args) {

        int m = 4;
        List<Integer> prices = new ArrayList<>(Arrays.asList(1,4,5,3,2));

        System.out.println(icecreamParlor(m, prices));

    }

    public static List<Integer> icecreamParlor(int m, List<Integer> arr) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < arr.size() -1; i++) {
            for (int j = i+1; j < arr.size(); j++) {
                if (arr.get(i) + arr.get(j) == m) {
                    res.add(i+1);
                    res.add(j+1);
                }
            }
        }
        return res;
    }
}
