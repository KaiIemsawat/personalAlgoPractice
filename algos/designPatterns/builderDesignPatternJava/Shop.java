package builderDesignPatternJava;

public class Shop {
    public static void main(String[] args) {
        Phone p = new PhoneBuilder().setOs("Android").setRam(4).setBattery(4200).setScreenSize(6.3).getPhone();

        System.out.println(p);
    }
}
