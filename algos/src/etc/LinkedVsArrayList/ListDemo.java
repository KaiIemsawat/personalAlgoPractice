package etc.LinkedVsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Zukkii");
        namesLinkedList.add("Titann");
        namesLinkedList.add("Kinkin");
        namesLinkedList.add("Kaikai");

        // Generally, slower than ArrayList when need to find an element. Always start finding from index 0
        System.out.println(namesLinkedList.get(2));

        // Faster than ArrayList. Java will just split nodes and add the new element at the correct location
        namesLinkedList.add(1, "Stokii");
        // Also the same in case of removing



        List<String> nameArrayList = new ArrayList<>();
        nameArrayList.add("Zukkii");
        nameArrayList.add("Titann");
        nameArrayList.add("Kinkin");
        nameArrayList.add("Kaikai");

        // Generally faster when finding an element thank to random access
        System.out.println(nameArrayList.get(2));

        // Slower. Java will create another array, copy all elements to the new array and have a spot for the new element
        nameArrayList.add(1, "Stokii");
        // Also the same in case of removing


        /* usage */
        // For large data that mostly need to retrieve information --> ArrayList
        // For large data that need to add / remove often --> LinkedList
        // Small data, small different, might not be able to tell
    }
}
