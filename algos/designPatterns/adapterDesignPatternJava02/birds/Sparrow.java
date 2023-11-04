package adapterDesignPatternJava02.birds;

import adapterDesignPatternJava02.interfaces.Bird;

public class Sparrow implements Bird {

    @Override
    public void fly() {
        System.out.println("Flying");
    }

    @Override
    public void makeSound() {
        System.out.println("Chirp chirp");
    }
}
