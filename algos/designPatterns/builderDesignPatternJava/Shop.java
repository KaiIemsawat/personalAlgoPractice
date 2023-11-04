package builderDesignPatternJava;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setRam(4).setBattery(4200).getPhone();

        System.out.println(p);
    }
}
