package linkedList;

public class DoublyLinkedList {

    DNode head;

    void insertAtHead(int data) {
        DNode newDNode = new DNode(data);

        if (head != null) {
            head.prev = newDNode;
        }

        newDNode.next = head;
        head = newDNode;
    }

    // Insert at tail
    void insertAtTail(int data) {
        DNode newDNode = new DNode(data);

        if (head == null) {
            head = newDNode;
            return;
        }

        DNode temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newDNode;
        newDNode.prev = temp;
    }

    // Insert at position (1-based index)
    void insertAtPosition(int data, int pos) {
        if (pos == 1) {
            insertAtHead(data);
            return;
        }

        DNode newDNode = new DNode(data);
        DNode temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) return;

        newDNode.next = temp.next;

        if (temp.next != null) {
            temp.next.prev = newDNode;
        }

        temp.next = newDNode;
        newDNode.prev = temp;
    }


    void delete(int key) {
        if (head == null) return;

        DNode temp = head;

        // delete head
        if (temp.data == key) {
            head = temp.next;
            if (head != null) head.prev = null;
            return;
        }

        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp == null) return;

        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }
    }

    // Forward
    void printForward() {
        DNode temp = head;

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // Backward
    void printBackward() {
        if (head == null) return;

        DNode temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.prev;
        }

        System.out.println("null");
    }


    // Length
    int length() {
        int count = 0;
        DNode temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    // Search
    boolean search(int key) {
        DNode temp = head;

        while (temp != null) {
            if (temp.data == key) return true;
            temp = temp.next;
        }

        return false;
    }

    void reverse() {
        DNode temp = null;
        DNode curr = head;

        while (curr != null) {
            // swap prev and next
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            curr = curr.prev;
        }

        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        // Insert operations
        list.insertAtHead(10);
        list.insertAtHead(5);
        list.insertAtTail(20);
        list.insertAtTail(30);

        System.out.println("Forward:");
        list.printForward();

        System.out.println("Backward:");
        list.printBackward();

        // Insert at position
        list.insertAtPosition(15, 3);
        System.out.println("After inserting 15 at pos 3:");
        list.printForward();

        // Delete
        list.delete(20);
        System.out.println("After deleting 20:");
        list.printForward();

        // Search
        System.out.println("Search 30: " + list.search(30));
        System.out.println("Search 100: " + list.search(100));

        // Length
        System.out.println("Length: " + list.length());

        // Reverse
        list.reverse();
        System.out.println("After reverse:");
        list.printForward();
    }
}