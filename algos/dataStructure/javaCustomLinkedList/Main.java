public class Main {
    public static void main(String[] args) {
        SinglyLL s_list = new SinglyLL();

        s_list.insertFirst(4);
        s_list.insertFirst(3);
        s_list.insertFirst(7);
        s_list.insertFirst(21);
        s_list.insertLast(99);
        s_list.insert(234, 3);

        System.out.println(s_list.deleteFirst());
        System.out.println("--");
        System.out.println(s_list.deleteLast());
        System.out.println("--");
        System.out.println(s_list.deleteAt(1));
        System.out.println("--");

        s_list.display();
    }
}
