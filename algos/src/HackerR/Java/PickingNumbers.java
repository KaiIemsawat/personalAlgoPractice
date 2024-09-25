package HackerR.Java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PickingNumbers {
    public static void main(String[] args) {

        List<Integer> input = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1 ,2 ));

        System.out.println(pickingNumbers(input));
    }

    public static int pickingNumbers(List<Integer> a) {
        int maxCount = 0;

        for (int i = 0; i < a.size(); i++) {
            int countHi = 1;
            int countLo = 1;
            for (int j = i; j < a.size()-1; j++) {
                if (a.get(i) - a.get(j+1) == 1 || a.get(i) - a.get(j+1) == 0) {
                    countLo++;
                }
                if (a.get(i) - a.get(j+1) == -1 || a.get(i) - a.get(j+1) == 0) {
                    countHi++;
                }
            }
            if (countHi > maxCount) {
                maxCount = countHi;
            }
            if (countLo > maxCount) {
                maxCount = countLo;
            }
        }
        return maxCount;
    }
}
