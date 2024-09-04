package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        ArrayList<String> input = new ArrayList<>(Arrays.asList("flower", "flow", "flight"));
        System.out.println(common(input));
    }

    static String common(ArrayList<String> toValidate) {
        if (toValidate == null || toValidate.size() == 0) {
            return "";
        }

        // Start with the first string as the prefix
        String prefix = toValidate.get(0);

        // Iterate over the other strings
        for (int i = 1; i < toValidate.size(); i++) {
            while (toValidate.get(i).indexOf(prefix) != 0) {
                // Shorten the prefix by one character until it matches the beginning of the string
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }

        return prefix;
    }
}
