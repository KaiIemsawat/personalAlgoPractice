package HackerR.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LeftRotation {
    public static void main(String[] args) {

        List<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        System.out.println(rotateLeft(4, arr));
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        while (d > 0) {
            int temp = arr.get(0);
            for (int i = 0; i< arr.size()-1; i++) {
                arr.set(i, arr.get(i+1));
                if (i == arr.size()-2) {
                    arr.set(arr.size()-1, temp);
                }
            }
            d--;
        }
        return arr;


    }
}
