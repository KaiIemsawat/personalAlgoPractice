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

    // Insert first node
    insertFirst(data) {
        this.head = new Node(data, this.head);
        this.size++;
    }

    // Insert last node
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

    // Insert at index
    insertAt(data, index) {
        if (index < 0 || index > this.size) {
            return;
        }
        // if first index
        if (index === 0) {
            this.head = new Node(data, this.head);
            // or
            // this.insertFirst(data) // since we already have this method created
            return;
        }

        const node = new Node(data);
        let current, previous;

        // set current first
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

    // Get at index
    getAt(index) {
        let current = this.head;
        let count = 0;
        if (index < 0 || index > this.size) {
            console.log("index out of bound..");
            return;
        }

        while (current) {
            if (count == index) {
                console.log(current.data);
            }
            count++;
            current = current.next;
        }
        return null;
    }

    // Remove at index

    // Clear list

    // Print list data
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
ll.insertLast(50);
ll.insertAt(500, -10);
ll.insertAt(600, 0);

ll.printListData();
console.log("-------");
ll.getAt(1);
ll.getAt(-1);
