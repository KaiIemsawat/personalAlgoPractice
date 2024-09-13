package etc.maps;

import java.util.HashMap;

public class MapsDemo {

    public static void main(String[] args) {
        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Zukkii", 3421);
        empIds.put("Titann", 5432);
        empIds.put("Kin", 10987);

        System.out.println(empIds);
        System.out.println("-----");

        System.out.println(empIds.get("Zukkii"));
        System.out.println(empIds.containsKey("Kin"));
        System.out.println(empIds.containsValue(4321));
        System.out.println("-----");
        empIds.put("Zukkii", 4321); // will replace the value
        System.out.println(empIds);

        empIds.replace("Zukkii", 2345); // will replace the value as well
        System.out.println(empIds);
        System.out.println("-----");

        empIds.put("Someone", 43224); // will create new pair if not already existed
        empIds.replace("Noone", 4564); // will not create a new pair if not already existed
        System.out.println(empIds);
        System.out.println("-----");

        empIds.putIfAbsent("Noone", 3335); // will add key/value if the pair is not already existed
        empIds.putIfAbsent("Someone", 3333); // will add key/value if the pair is not already existed
        System.out.println(empIds);

        empIds.remove("Someone");
        System.out.println(empIds);
    }
}
