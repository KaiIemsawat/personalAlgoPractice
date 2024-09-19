package leetcode;

import java.util.HashMap;
import java.util.Map;

public class Leet383_RansomNote {

    public static void main(String[] args) {

        String note = "aaa";
        String magazine = "aaab";

        System.out.println(canConstruct(note, magazine));

    }

    public static boolean canConstruct(String ransomNote, String magazine) {
        Map<Character, Integer> magazineLetters = new HashMap<>();

        for (int i = 0; i < magazine.length(); i++) {
            char m = magazine.charAt(i);

            int currentCount = magazineLetters.getOrDefault(m, 0);
            // map.getOrDefault(key, defaultValue) is used to get the value from key.
            // But if the key is not exist, return the input defaultValue.

            // every time input new char currentCount will be 1.
            // But if the char already existed, the count will add up
            magazineLetters.put(m, currentCount+1);
        }

        for (int i = 0; i < ransomNote.length(); i++) {
            char r = ransomNote.charAt(i);

            int currentCount = magazineLetters.getOrDefault(r, 0);

            if (currentCount == 0) {
                return false;
            }

            magazineLetters.put(r, currentCount-1);
        }

        return true;
    }
}
