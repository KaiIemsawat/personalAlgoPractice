package etc.hashTable;

import java.util.Hashtable;

public class HashTableDemo {
    public static void main(String[] args) {

        // By default, hashtable has the initial capacity of 11 elements and load factor of 0.75
        // Once 75% filled, it will generate more
        // In this example, will set at 10/0.6
        Hashtable<String, String> table = new Hashtable<>(10, .6f);

        table.put("100", "Spongebob");
        table.put("123", "Patrick");
        table.put("321", "Sandy");
        table.put("555", "Squidward");
        table.put("777", "Gary");

        System.out.println(table.get(100));
        System.out.println("-------------");

        System.out.println("== print values ==");
        for ( String value: table.values()) {
            System.out.println(value);
        }
        System.out.println("== print keys ==");
        for (String key : table.keySet()) {
            System.out.println(key);
        }

        System.out.println("-------------");

        for (String key : table.keySet()) {
            System.out.println(key + " : " + table.get(key) + " -- " + key.hashCode() % 10);
        }

        System.out.println("-------------");



    }
}
