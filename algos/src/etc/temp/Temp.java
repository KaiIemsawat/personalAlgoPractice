package etc.temp;

public class Temp {
    public static void main(String[] args) {
        int i = 0;
        while (i != 4) {
            switch (i) {
                case 0 :
                    System.out.println(0); break;
                case 1 :
                    System.out.println(1); break;
                default:
                    System.out.println("x"); break;
            }
            i++;
        }
    }
}
