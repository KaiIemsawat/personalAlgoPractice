package etc.maps;

import java.util.HashMap;
import java.util.Map;

public class MostCommonCharacters {
    public static void main(String[] args) {
        String str = "gsgfdgssssg";
        System.out.println(recurringChar(str));
    }

    public static char recurringChar(String str) {

        Map<Character, Integer> countMap = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            if (!countMap.containsKey(str.charAt(i))) {
                countMap.put(str.charAt(i), 1);
            } else {
                countMap.put(str.charAt(i), countMap.get(str.charAt(i)) + 1);
            }
        }

        int max = 0;
        char res = ' ';
        for (Map.Entry<Character, Integer> e : countMap.entrySet()) {
            if (e.getValue() > max) {
                max = e.getValue();
            }
        }
        for (Map.Entry<Character, Integer> e : countMap.entrySet()) {
            if (e.getValue() == max) {
                res = e.getKey();
            }
        }
        return res;
    }
}
