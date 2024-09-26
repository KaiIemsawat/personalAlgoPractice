package HackerR;

import java.util.*;

public class MissingNumbers {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(203, 204, 205, 206, 207, 208, 203, 204, 205, 206));
        List<Integer> b = new ArrayList<>(Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204));

        System.out.println(missingNumbers(a, b));

    }

    public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
        List<Integer> res = new ArrayList<>();

        // Use maps to count the frequency of each number in arr and brr
        Map<Integer, Integer> arrCount = new HashMap<>();
        Map<Integer, Integer> brrCount = new HashMap<>();

        // Putting values to map. If Key exist, +1 to value, else put new key with value of 1
        for (int num : arr) {
            arrCount.put(num, arrCount.getOrDefault(num, 0) + 1);
        }

        for (int num : brr) {
            brrCount.put(num, brrCount.getOrDefault(num, 0) + 1);
        }

        // Compare frequencies and find missing numbers
        for (int num : brrCount.keySet()) {
            if (!arrCount.containsKey(num) || arrCount.get(num) < brrCount.get(num)) {
                res.add(num);
            }
        }

        // Sort result to match expected output
        Collections.sort(res);
        return res;
    }
}
