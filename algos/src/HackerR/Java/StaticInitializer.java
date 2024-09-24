package HackerR.Java;

public class StaticInitializer {

    static int b;
    static int h;
    static boolean isPositive = true;
    static {
        b = 3;
        h = -1;

        try {
            if (b <= 0 || h <= 0) {
                isPositive = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception exception) {
            System.out.println(exception);
        }
    }


    public static void main(String[] args) {
        if (isPositive) {
            System.out.println(b*h);
        }
    }
}
