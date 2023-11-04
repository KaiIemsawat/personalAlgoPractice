package factoryDesignPatternJava.product;

public class Window implements OS{
    @Override
    public void spec() {
        System.out.println("What is it?");
    }
}
