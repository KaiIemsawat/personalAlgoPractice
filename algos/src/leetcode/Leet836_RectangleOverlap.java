package leetcode;

public class Leet836_RectangleOverlap {
    public static void main(String[] args) {
        /* Expect true */
        int[] rec1 = {0,0,2,2};
        int[] rec2 = {1,1,3,3,};

        /* Expect false */
//        int[] rec1 = {0,0,1,1};
//        int[] rec2 = {1,0,2,1};

        /* Expect false */
//        int[] rec1 = {0,0,1,1};
//        int[] rec2 = {2,2,3,3};
        System.out.println(isRectangleOverlap(rec1, rec2));
    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        if ((rec1[2] > rec2[0] && rec1[3] > rec2[1]) && (rec1[0] < rec2[2] && rec1[1] < rec2[3])){
            return true;
        }
        return false;
    }
}
