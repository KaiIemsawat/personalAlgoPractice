package leetcode;

import java.util.Arrays;

public class Leet67_AddBinary {
    public static void main(String[] args) {
        String a = "11";
        String b = "11";

        System.out.println(addBinary(a, b));
    }



    public static String addBinary(String a, String b) {

        if (a.length() == 1 && a.equals("0")) return b;
        if (b.length() == 1 && b.equals("0")) return a;

        StringBuilder sb = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0'; // '-0' to convert to actual 0 or 1 as int
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
            }

            sb.append(sum%2);
            carry = sum/2;

            i--; j--;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}
