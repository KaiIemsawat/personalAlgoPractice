package adapterDesignPatternJava.mainPackage;

import adapterDesignPatternJava.anotherPackage.BluePen;

public class PenAdapter implements Pen{

    BluePen bluePen = new BluePen();

    @Override
    public void write(String str) {
        bluePen.mark(str);
    }
}
