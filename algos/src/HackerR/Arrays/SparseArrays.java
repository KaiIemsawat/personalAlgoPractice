package HackerR.Arrays;

import java.util.ArrayList;
import java.util.List;

public class SparseArrays {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        List<String> q = new ArrayList<>();

        stringList.add("ab");
        stringList.add("ab");
        stringList.add("abc");

        q.add("ab");
        q.add("abc");
        q.add("bc");

        System.out.println(matchingStrings(stringList, q));


    }

    public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        List<Integer> res = new ArrayList<>();
        int count = 0;

        for (int i = 0; i<queries.size(); i++) {
            for (int j = 0; j<stringList.size(); j++) {
                if (stringList.get(j).equals(queries.get(i))) {
                    count++;
                }
            }
            res.add(count);
            count = 0;
        }


        return res;
    }
}
