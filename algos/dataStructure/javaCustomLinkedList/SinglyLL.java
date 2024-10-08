public class SinglyLL {

    private Node head;
    private Node tail;
    private int size;
    
    public SinglyLL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }

        // If the next node from tail is not null, assign the next node with new node value
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        // Find node at 'index - 1' and assign it to 'temp'
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        // node will have the value of the input, its 'next' will be 'temp.next'
        Node node = new Node(val, temp.next);
        // then the next of 'temp' will be this 'node'
        temp.next = node;

        size++;
    }

    public int deleteAt(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size -1) {
            return deleteLast();
        }

        Node prev = getNodeByIndex(index - 1);
        int val = prev.next.value;
        prev.next = prev.next.next;

        return val;
    }


    public Node getNodeByValue(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }


    public Node getNodeByIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondLast = getNodeByIndex(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;

        return val;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
