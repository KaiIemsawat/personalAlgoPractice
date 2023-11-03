package etc;

public class Varargs {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        System.out.println(obj.add(3,56, 4, 1, 41));
    }
}

class Calculator {
    public int add (int ... n) {
        int sum = 0;
        for (int i : n) {
            sum += i;
        }
        return sum;
    }
}