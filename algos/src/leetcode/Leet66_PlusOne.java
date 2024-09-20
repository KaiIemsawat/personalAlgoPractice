package leetcode;

import java.util.Arrays;

public class Leet66_PlusOne {
    public static void main(String[] args) {
        int[] input = {2, 9, 9, 9};

        System.out.println(Arrays.toString(plusOne(input)));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length-1; i>=0; i--) {
            // If the last is not '9', go into if() one time and return
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            // But if every index from the back are '9s' assign new number as '0'
            digits[i] = 0;
        }
        // If the numbers are 9 to the very first one, create a new array
        int[] newNums = new int[digits.length + 1];
        newNums[0] = 1;
        return newNums;
    }
}
