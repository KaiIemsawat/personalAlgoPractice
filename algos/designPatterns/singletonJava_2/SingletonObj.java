package singletonJava_2;

public class SingletonObj {

    /* Early initialization */
    // ----
    // Plus : easy to create
    // Minus : It will be created even if not needed
//    public static SingletonObj objInstance = new SingletonObj();
//
//    private SingletonObj() {}
//
//    public void doSomething() {
//        System.out.println("This method is doing something");
//    }
    // ----

    /* Lazy initialization*/
//    1. create obj instance
//    2. create private no arg constructor
//    3. create getInstance.
    public static SingletonObj objInstance = null;

    private SingletonObj() {}

    public static SingletonObj getInstance() {
        if (objInstance == null) {
            objInstance = new SingletonObj();
        }
        return objInstance;
    }

    public void doSomething() {
        System.out.println("This method is doing something");
    }

}
