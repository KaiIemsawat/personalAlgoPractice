public class Main {
    public static void main(String[] args) {
        LL list = new LL();

        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(7);
        list.insertFirst(21);
        list.insertLast(99);
        list.insert(234, 3);

        System.out.println(list.deleteFirst());
        System.out.println("--");
        System.out.println(list.deleteLast());
        System.out.println("--");
        System.out.println(list.deleteAt(1));
        System.out.println("--");

        list.display();
    }
}
