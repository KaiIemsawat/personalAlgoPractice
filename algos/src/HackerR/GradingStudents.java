package HackerR;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GradingStudents {
    public static void main(String[] args) {
        List<Integer> input = new ArrayList<>(Arrays.asList(73, 67, 38, 33));

        System.out.println(gradingStudents(input));
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i<grades.size(); i++) {
            if (grades.get(i) >= 37) {
                System.out.println(grades.get(i)%5);
                if (5-(grades.get(i)%5) <= 2 ) {
                    grades.set(i, grades.get(i) + (5-(grades.get(i)%5)));
                }
            }
            res.add(grades.get(i));
        }

        return res;
    }
}
