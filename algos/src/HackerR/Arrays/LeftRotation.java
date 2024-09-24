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

        System.out.println(rotateLeft(3, arr));
    }

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        List<Integer> ret = new ArrayList<>();

        for (int i = d; i < arr.size(); i++) {
            ret.add(arr.get(i));
        }

        for (int i = 0; i < d; i++) {
            ret.add(arr.get(i));
        }
        return ret;

    }
}
