package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Stream102 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,4,5,6,7,2);

        int res = nums.stream()
                .filter(n -> (n%2 == 1))
                .map(n -> n*n)
                .sorted()
                .reduce(0, (c,e) -> c+e);

        System.out.println(res);
    }
}
