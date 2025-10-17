package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream101 {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(3,4,5,6,7,2);

//        Stream<Integer> data = nums.stream();

//        data.forEach(System.out::println);
//        data.forEach(System.out::println); // Stream can only be used once !!

//        Long count = data.count();
//        System.out.println(count);

//        Stream<Integer> sortedData = data.sorted();
//        sortedData.forEach(System.out::println);

//        Stream<Integer> mappedData = data.map(n -> n*2);
//        mappedData.forEach(System.out::println);

        // (from line 11) Convert to
        nums.stream()
                .filter(n -> n%2 != 0)
                .map(n -> n*n)
                .sorted()
                .forEach(System.out::println);

    }
}
