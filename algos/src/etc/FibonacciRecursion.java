package etc;

public class FibonacciRecursion {
    public static void main(String[] args) {
        int input = 9;
        System.out.println(fibonacci(input));
    }

    private static int fibonacci(int input) {
        if (input<=1) {
            return input;
        }
        return (fibonacci(input-1) + fibonacci(input-2));
    }
}
