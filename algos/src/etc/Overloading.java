package etc;

public class Overloading {
    public static void main(String[] args) {

        var x = add(1.3,3.1,5.3);

        System.out.println(x );
    }

    static int add(int a, int b) {
        System.out.println("Overload : 1");
        return a + b;
    }

    static int add(int a, int b, int c) {
        System.out.println("Overload : 2");
        return a + b + c;
    }

    static int add(int a, int b, int c, int d) {
        System.out.println("Overload : 3");
        return a + b + c + d;
    }

    static double add(double a, double b) {
        System.out.println("Overload : 4");
        return a + b;
    }

    static double add(double a, double b, double c) {
        System.out.println("Overload : 5");
        return a + b + c;
    }

    static double add(double a, double b, int c, double d) {
        System.out.println("Overload : 6");
        return a + b + c + d;
    }
}
