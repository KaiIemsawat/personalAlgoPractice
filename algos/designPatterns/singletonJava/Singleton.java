package singletonJava;

public class Singleton {
    public static void main(String[] args) {
//        ThisClass obj1 = new ThisClass(); // this will not work since private ThisClass() {} was declared
//        USE
        ThisClass obj1 = ThisClass.getInstance();
        ThisClass obj2 = ThisClass.getInstance();
        System.out.println(obj1 == obj2);
    }
}

class ThisClass {
    static ThisClass obj = new ThisClass();
    private ThisClass() {}
    public static ThisClass getInstance(){
        return obj;
    }
}