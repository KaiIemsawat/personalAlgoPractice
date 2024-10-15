package HackerR;

import java.util.Arrays;
import java.util.List;

public class BillDivision {
    public static void main(String[] args) {
        int k = 1;
        int b = 7;
        List<Integer> bill = Arrays.asList(3, 10, 2, 9);

        bonAppetit(bill, k, b);
    }

    public static void bonAppetit(List<Integer> bill, int k, int b) {
        // Write your code here
        int[] annaEats = new int[bill.size() - 1];
        int j = 0;
        for (int i = 0; i < bill.size(); i ++) {
            if (i == k) {
                continue;
            }
            annaEats[j] = bill.get(i);
            j++;
        }

        int total = 0;
        for (int i = 0; i < annaEats.length; i++) {
            total = total + annaEats[i];
        }

        if (b == (total / 2)) System.out.print("Bon Appetit");
        else System.out.print(b - (total/2));
    }
}
