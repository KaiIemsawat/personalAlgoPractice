package etc.recursion;

public class CountEight {


/*
    Given a non-negative int n, compute recursively (no loops) the count of the occurrences of 8 as a digit,
    except that an 8 with another 8 immediately to its left counts double,
    so 8818 yields 4.

    count8(8) → 1
    count8(818) → 2
    count8(8818) → 4
*/
    public static void main(String[] args) {
        System.out.println(count8(8818));
    }

    public static int count8(int n) {
        if (n < 10 && n != 8) return 0;
        if (n % 100 == 88) return 2 + count8(n/10);
        else if (n % 10 ==8) { return 1 + count8(n/10);}
        else return count8(n/10);
    }
}


