package singletonJava_2;

public class App {
    public static void main(String[] args) {
        SingletonObj singletonObj_1 = SingletonObj.getInstance();
        SingletonObj singletonObj_2 = SingletonObj.getInstance();
        System.out.println(singletonObj_1 == singletonObj_2);

        singletonObj_1.doSomething();
    }
}
