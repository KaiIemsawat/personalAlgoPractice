package etc.recursion;

public class CountSeven {
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
