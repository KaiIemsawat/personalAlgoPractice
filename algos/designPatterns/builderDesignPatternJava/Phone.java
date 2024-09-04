package builderDesignPatternJava;
/* BUILDER PATTERN */
public class Phone {
    private String os;
    private int ram;
    private String processor;
    private double screenSize;
    private int battery;
    private double osVersion;

    public Phone(String os, int ram, String processor, double screenSize, int battery, double osVersion) {
        this.os = os;
        this.ram = ram;
        this.processor = processor;
        this.screenSize = screenSize;
        this.battery = battery;
        this.osVersion = osVersion;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "os='" + os +
                ", ram=" + ram +
                ", processor='" + processor +
                ", screenSize=" + screenSize +
                ", battery=" + battery +
                ", os version=" + osVersion +
                '}';
    }
}
