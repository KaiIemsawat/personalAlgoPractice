package dataStructure;

import java.util.LinkedList;

public class LinkedListCustom {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.add(1, "E");
//        linkedList.pop(); // F is gone
        linkedList.remove("A");


//        linkedList.offer("H");
//        linkedList.offer("I");
//        linkedList.offer("J");
//        linkedList.offer("K");
//        linkedList.offer("L");
//        linkedList.poll(); // H is gone


        System.out.println(linkedList);

    }
}
