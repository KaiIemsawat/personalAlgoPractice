package leetcode;

public class Leet58_LengthOfLastWord {
    public static void main(String[] args) {
        String input = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord(input));
    }

    public static int lengthOfLastWord(String s) {
        int count = 0;
        String temp = s.trim();

        for (int i = temp.length()-1; i >= 0; i--) {
            if (temp.charAt(i) != ' ') {
                count++;
            } else return count;
        }
        return count;
    }
}
