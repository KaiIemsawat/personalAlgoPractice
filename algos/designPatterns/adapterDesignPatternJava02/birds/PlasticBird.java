package adapterDesignPatternJava02.birds;

import adapterDesignPatternJava02.interfaces.ToyDuck;

public class PlasticBird implements ToyDuck {
    @Override
    public void squeak() {
        System.out.println("SQUEAKKKKKK");
    }
}
