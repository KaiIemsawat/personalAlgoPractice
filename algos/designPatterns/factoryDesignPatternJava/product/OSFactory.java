package factoryDesignPatternJava.product;
/* FACTORY PATTERN */
public class OSFactory {
    public OS getInstance(String str) {
        if (str.equals("an")) {
            return new Android();
        }
        else if (str.equals("ip")) {
            return new IOS();
        }
        else if (str.equals("win")) {
            return new Window();
        }
        else {
            return null;
        }
    }
}
