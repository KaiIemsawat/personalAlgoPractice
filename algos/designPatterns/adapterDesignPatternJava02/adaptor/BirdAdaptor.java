package adapterDesignPatternJava02.adaptor;

import adapterDesignPatternJava02.interfaces.Bird;
import adapterDesignPatternJava02.interfaces.ToyDuck;

public class BirdAdaptor implements ToyDuck {

    Bird bird;
    public BirdAdaptor(Bird bird) {
        this.bird = bird;
    }

    @Override
    public void squeak() {
        bird.makeSound();
    }
}
