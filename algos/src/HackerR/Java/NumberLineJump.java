package HackerR.Java;

public class NumberLineJump {

    public static void main(String[] args) {


        System.out.println( kangaroo(1,6,4,5));
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        if(x1>x2 && v1>=v2)
            return "NO";
        else if(x2>x1 && v2>=v1)
            return "NO";
        if ((x2 - x1) % (v1 - v2) == 0)
            return "YES";
        else
            return "NO";
    }
}
