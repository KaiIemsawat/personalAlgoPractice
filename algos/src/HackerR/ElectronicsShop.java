package HackerR;

import java.util.Arrays;
import java.util.Vector;

public class ElectronicsShop {
    public static void main(String[] args) {
        int b = 10;

        int[] keyboards = {3 ,1};
        int[] drives = {5, 2, 8};

        System.out.println(getMoneySpent(keyboards, drives, b));
    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {

        int max = -1;

        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (keyboards[i] + drives[j] > max && keyboards[i] + drives[j] <= b) {
                    max = keyboards[i] + drives[j];
                }
            }
        }
        return max;
    }
}
