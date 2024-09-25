package HackerR.Java;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class MagicSquare {

    public static void main(String[] args) {
        List<Integer> inner = new ArrayList<>();
        List<Integer> inner2 = new ArrayList<>();
        List<Integer> inner3 = new ArrayList<>();

        List<List<Integer>> outer = new ArrayList<>();
        inner.add(5);
        inner.add(3);
        inner.add(4);
        outer.add(inner);
        inner2.add(1);
        inner2.add(5);
        inner2.add(8);
        outer.add(inner2);
        inner3.add( 6);
        inner3.add(4);
        inner3.add(2);
        outer.add(inner3);

        System.out.println(outer);

        System.out.println(formingMagicSquare(outer));

    }

    public static int formingMagicSquare(List<List<Integer>> s) {
        int[] square = {
                s.get(0).get(0), s.get(0).get(1), s.get(0).get(2),
                s.get(1).get(0), s.get(1).get(1), s.get(1).get(2),
                s.get(2).get(0), s.get(2).get(1), s.get(2).get(2)
        };

        int[][] magicSquares = {
                {2,9,4,7,5,3,6,1,8},
                {8,3,4,1,5,9,6,7,2},
                {2,7,6,9,5,1,4,3,8},
                {8,1,6,3,5,7,4,9,2},
                {4,3,8,9,5,1,2,7,6},
                {6,1,8,7,5,3,2,9,4},
                {4,9,2,3,5,7,8,1,6},
                {6,7,2,1,5,9,8,3,4} };

        int minSum = Integer.MAX_VALUE;
        for(int i = 0; i < magicSquares.length; i++) {
            int sum = 0;
            for(int j = 0; j < magicSquares[i].length; j++) {
                sum += Math.abs(magicSquares[i][j] - square[j]);
                if (sum > minSum) break;
            }
            if (sum < minSum) {
                minSum = sum;
            }
        }
        return minSum;
    }
}
