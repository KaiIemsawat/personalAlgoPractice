public class Main {
    public static void main(String[] args) {
//        SinglyLL s_list = new SinglyLL();
//
//        s_list.insertFirst(4);
//        s_list.insertFirst(3);
//        s_list.insertFirst(7);
//        s_list.insertFirst(21);
//        s_list.insertLast(99);
//        s_list.insert(234, 3);
//
//        s_list.display();
//        System.out.println(s_list.deleteFirst());
//        System.out.println("--");
//        System.out.println(s_list.deleteLast());
//        System.out.println("--");
//        System.out.println(s_list.deleteAt(1));
//        System.out.println("--");
//
//        s_list.display();


        DoublyLL d_list = new DoublyLL();

        d_list.insertFirst(3);
        d_list.insertFirst(5);
        d_list.insertFirst(7);
        d_list.insertFirst(9);
        d_list.insertFirst(11);
        d_list.insertFirst(1);
        d_list.insertLast(999);
        d_list.insertAfter(5, 88);
        d_list.insertAt(0,77);

        d_list.display();
        System.out.println();
        System.out.println(d_list.getNodeByIndex(2));
    }
}
