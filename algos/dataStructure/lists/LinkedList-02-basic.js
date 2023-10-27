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
    removeAt(index) {
        if (index < 0 || index > this.size) {
            console.log("index out of bound..");
            return;
        }

        let current = this.head;
        let previous;
        let count = 0;

        // remove first
        if (index === 0) {
            this.head = current.next;
        } else {
            while (count < index) {
                count++;
                previous = current;
                current = current.next;
            }
            previous.next = current.next;
        }
        this.size--;
    }

    // Remove last index
    removeLast() {
        if (this.size === 0) {
            return;
        }
        let current = this.head;
        let previous;

        while (current.next !== null) {
            previous = current;
            current = current.next;
        }
        previous.next = current.next;
        this.size--;
    }

    // Remove first index
    removeFirst() {
        if (this.size === 0) {
            return;
        }
        let current = this.head;
        this.head = current.next;
        this.size--;
    }

    // Clear list
    clearList() {
        this.head = null;
        this.size = 0;
    }

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
console.log("-------");
console.log("before remove index ...");
ll.printListData();
console.log("remove at index..");
ll.removeAt(1);
console.log("current list element");
ll.printListData();
console.log("-------");

console.log(ll.size);
console.log("-------");
console.log("before remove first index");
ll.printListData();
console.log("-------");
console.log("after remove first index");
ll.removeFirst();
ll.printListData();
console.log("-------");
console.log("remove last index");
ll.removeLast();
ll.printListData();

console.log("-------");
console.log("Clear list");
ll.clearList();
ll.printListData();
console.log(ll.size);
