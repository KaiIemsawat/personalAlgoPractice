package factoryDesignPatternJava.defaultPackage;

import factoryDesignPatternJava.product.*;

public class FactoryMain {
    public static void main(String[] args) {
        OSFactory osf = new OSFactory();
        OS obj = osf.getInstance("what");
        obj.spec();
    }
}
