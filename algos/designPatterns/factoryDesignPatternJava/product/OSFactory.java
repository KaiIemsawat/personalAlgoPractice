package factoryDesignPatternJava.product;
/* FACTORY PATTERN */
public class OSFactory {
    public OS getInstance(String str) {
        if (str.equals("green")) {
            return new Android();
        }
        else if (str.equals("boring")) {
            return new IOS();
        }
        else if (str.equals("what?")) {
            return new Window();
        }
        else {
            return null;
        }
    }
}
