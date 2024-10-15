package HackerR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SalesByMatch {
    public static void main(String[] args) {
        int n = 9;
        List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);

        System.out.println(sockMerchant(n, ar));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        int count = 0;
        List<Integer> loopList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (!loopList.contains(ar.get(i))) {
                loopList.add(ar.get(i));
            } else {
                count = count + 1;
                loopList.remove(ar.get(i));
            }
        }
        return count;
    }
}
