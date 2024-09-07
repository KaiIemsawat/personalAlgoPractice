package etc;

public class FibonacciRecursion {

    private static long[] fibonacciCache;

    public static void main(String[] args) {
        int input = 50;

        fibonacciCache = new long[input + 1];

        for (int i = 0; i<= input; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println(fibonacci(input));
    }

    private static long fibonacci(int input) {
        if (input<=1) {
            return input;
        }

        if (fibonacciCache[input] != 0) return fibonacciCache[input];

        long nthFibonacciNumber = (fibonacci(input-1) + fibonacci(input-2));

        fibonacciCache[input] = nthFibonacciNumber;
        return nthFibonacciNumber;
    }
}
