class Node {
    constructor(data, next = null) {
        this.data = data;
        this.next = next;
    }
}

class LinkedList {
    constructor() {
        this.head = null;
        this.size = 0;
    }

    // ! Insert first node
    insertFirst(data) {
        this.head = new Node(data, this.head);
        this.size++;
    }

    // ! Insert last node
    insertLast(data) {
        let node = new Node(data);
        let current;

        // if empty, make head
        if (!this.head) {
            this.head = node;
        } else {
            current = this.head;

            while (current.next) {
                current = current.next;
            }
            current.next = node;
        }
        this.size++;
    }

    // ! Insert at index
    insertAt(data, index) {
        // if index is out of renge
        if (index < 0 || index > this.size) {
            console.log("index out of bound and none will be added");

            return;
        }

        // if first index
        if (index === 0) {
            this.head = new Node(data, this.head);
            return;
        }

        let node = new Node(data);
        let current, previous;

        // set current to first
        current = this.head;
        let count = 0;
        while (count < index) {
            previous = current; // Node before index
            count++;
            current = current.next; // Node after index
        }

        node.next = current;
        previous.next = node;

        this.size++;
    }

    // ! Get at index
    getAt(index) {
        if (index < 0 || index > this.size) {
            console.log("index out of bound and get no value");
            return;
        }
        let current = this.head;
        let count = 0;

        while (current) {
            if (count == index) {
                console.log(current.data);
            }
            count++;
            current = current.next;
        }
        return null;
    }

    // ! Remove at index
    removeAt(index) {
        if (index < 0 || index > this.size) {
            console.log("index out of bound and none will be removed");
            return;
        }

        let current = this.head;
        let previous;
        let count = 0;

        // remove first
        if (index === 0) {
            this.head = current.next;
        }
        // the rest
        else {
            while (count < index) {
                count++;
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
        }
        this.size--;
    }

    // ! Clear list
    clearList() {
        this.head = null;
        this.size = 0;
    }

    // ! Print list data
    printListData() {
        let current = this.head;

        while (current) {
            console.log(current.data);
            current = current.next;
        }
    }
}

const ll = new LinkedList();
ll.insertFirst(100);
ll.insertFirst(200);
ll.insertFirst(300);
ll.insertLast(400);
ll.insertAt(500, 2);

ll.removeAt(2);
ll.printListData();
console.log("---------");
ll.getAt(1);
console.log("---------");
ll.clearList();
ll.printListData();
