public class DoublyLL {

    private Node head;
    private Node tail;
    private int size;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;

        if (head != null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node last = head;

        node.next = null;

        // edge case when list size = 0
        if (head == null) {
            node.prev = null;
            head = node;
            return;
        }

        // iterate through list until the last.next = null
        while (last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.prev = last;

        size++;
    }

    public Node getNodeByValue(int value) {
        Node node = head;
        while (node != null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertAfter(int after, int val) {
        Node p = getNodeByValue(after);

        if (p == null) {
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if (node.next != null) {
            node.next.prev = node;
        }
        size++;
    }

    public Node getNodeByIndex(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    public void insertAt(int index, int val) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        Node currentNodeAtIndex = getNodeByIndex(index);

        if (currentNodeAtIndex == null) {
            System.out.println("Does not exist");
            return;
        }

        Node node = new Node(val);
        node.next = currentNodeAtIndex;
        node.prev = currentNodeAtIndex.prev;
        currentNodeAtIndex.prev = node;
        node.prev.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        head.prev = null;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }

        Node secondFromLast = getNodeByIndex(size - 2);
        int val = getNodeByIndex(size-1).val;
        tail = secondFromLast;
        tail.next = null;

        return val;
    }


    public void display() {
        Node node = head;
        Node last = null;
        while (node != null) {
            System.out.print(node.val + " -> ");
            last = node;
            node = node.next;
        }
        System.out.println("END");
        System.out.println("PRINT IN REVERSE");

        while (last != null) {
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }


    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }
}
