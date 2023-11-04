package adapterDesignPatternJava02;

import adapterDesignPatternJava02.adaptor.BirdAdaptor;
import adapterDesignPatternJava02.birds.PlasticBird;
import adapterDesignPatternJava02.birds.Sparrow;
import adapterDesignPatternJava02.interfaces.ToyDuck;

public class Main {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        ToyDuck toyDuck = new PlasticBird();

        ToyDuck birdAdapter = new BirdAdaptor(sparrow);

        System.out.println("Sparrow....");
        sparrow.fly();
        sparrow.makeSound();

        System.out.println("ToyDuck....");
        toyDuck.squeak();

        System.out.println("BirdAdapter....");
        birdAdapter.squeak();
    }
}
