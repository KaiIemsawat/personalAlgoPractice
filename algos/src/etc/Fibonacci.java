package etc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static void main(String[] args) {
        int input = 8;
        System.out.println(fibonacci(input));
    }

    private static List<Integer> fibonacci(int input) {
        List<Integer> res = new ArrayList<>(Arrays.asList(0));
        if (input == 1) return res;
        res.add(1);
        if (input == 2) return res;

        for (int i = 3; i <= input; i++) {
            res.add(res.get(res.size()-1) + res.get(res.size()-2));
        }
        return res;
    }
}
