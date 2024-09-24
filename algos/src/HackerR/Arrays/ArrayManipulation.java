package HackerR.Arrays;

import java.util.*;

public class ArrayManipulation {

    public static void main(String[] args) {
        List<List<Integer>> queries = new ArrayList<>();
        List<Integer> subQueries1 = new ArrayList<>();
        List<Integer> subQueries2 = new ArrayList<>();
        List<Integer> subQueries3 = new ArrayList<>();

        subQueries1.add(1);
        subQueries1.add(2);
        subQueries1.add(100);
        queries.add(subQueries1);
        subQueries2.add(2);
        subQueries2.add(5);
        subQueries2.add(100);
        queries.add(subQueries2);
        subQueries3.add(3);
        subQueries3.add(4);
        subQueries3.add(100);
        queries.add(subQueries3);

        int n = queries.size();

        System.out.println(queries);

        System.out.println(arrayManipulation(5, queries));

    }

    public static long arrayManipulation(int n, List<List<Integer>> queries) {
        long[] array = new long[n+2];
        for(int i = 0; i < queries.size(); i++) {
            long numberToAdd = queries.get(i).get(2);
            int startIndex = queries.get(i).get(0);
            int endIndex = queries.get(i).get(1);

            array[startIndex] += numberToAdd;
            array[endIndex+1] -= numberToAdd;
        }
        long max = 0;
        for(int i = 1; i < array.length; i++) {
            array[i] += array[i-1];
            max = Math.max(array[i],max);
        }
        return max;
    }
}
