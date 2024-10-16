package HackerR;

public class CountingValleys {

    public static void main(String[] args) {
        int steps = 8;
        String path = "UDDDUDUU";
        System.out.println(countingValleys(steps, path));
    }

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int count = 0;
        int level = 0;
        for (int i = 0; i < path.length(); i++) {
            if (path.charAt(i) == 'U') {
                level = level + 1;
            } else level = level - 1;

            if (path.charAt(i) == 'U' && level == 0) {
                count++;
            }
        }
        return count;
    }
}
