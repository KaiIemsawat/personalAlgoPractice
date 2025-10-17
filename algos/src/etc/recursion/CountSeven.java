package etc.recursion;

public class CountSeven {


/*
    Given a non-negative int n, return the count of the occurrences of 7 as a digit,
    so for example 717 yields 2. (no loops).

    count7(717) → 2
    count7(7) → 1
    count7(123) → 0
 */
    public static void main(String[] args) {
        System.out.println(count7(77323717));
    }

    private static int count7(int n) {
        if (n < 10 && n != 7) return 0;
        int count = 0;

        int lastD = n % 10;
        if (lastD == 7) count = 1;
        n = n /10;
        return count + count7(n);
    }

}
