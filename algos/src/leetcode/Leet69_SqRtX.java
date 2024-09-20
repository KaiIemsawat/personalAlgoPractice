package leetcode;

public class Leet69_SqRtX {

    public static void main(String[] args) {
        int x = 2147483647;
        System.out.println(mySqrt(x));
    }

    public static int mySqrt(int x) {
        if (x == 0 || x == 1) return x;
        long edgeCase = x;
        for (long i = 0; i<edgeCase; i++) {
            if (i*i == edgeCase) {
                return (int)i;
            }
            if (i*i > edgeCase) {
                return (int)i-1;
            }
        }
        return 1;
    }
}
