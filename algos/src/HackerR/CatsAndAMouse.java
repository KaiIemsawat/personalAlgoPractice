package HackerR;

public class CatsAndAMouse {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = 3;

        System.out.println(catAndMouse(x, y, z));
    }

    static String catAndMouse(int x, int y, int z) {
        if (Math.abs(x - z) < Math.abs(y - z)) {
            return "Cat A";
        } else if (Math.abs(x - z) > Math.abs(y - z)) {
            return "Cat B";
        } else return "Mouse C";
    }
}
