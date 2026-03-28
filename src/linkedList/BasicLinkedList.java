package linkedList;

public class BasicLinkedList {
    Node head;

    void printList() {
        Node temp = head;

        while (temp != null) {
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }

//        System.out.println(temp);
    }

    void insertAtHead(int data) {
        Node nweNode = new Node(data);
        nweNode.next = head;
        head = nweNode;
    }

    void insertAtTail(int data) {
        Node nweNode = new Node(data);

        if (head == null) {
            head = nweNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = nweNode;

    }

    void removeData(int data) {
        if (head == null) {
            return;
        }

        if (head.data == data) {
            head = head.next;
            return;
        }

        Node temp = head;

        while (temp.next != null && temp.next.data != data) {
            System.out.println("Data in loop" + temp.data);
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }

    }

    void reverse() {
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            // find the nxt node
            Node next = curr.next;

            // Assign pre into current node
            curr.next = prev;

            // Update prev with current
            prev = curr;

            // Update current with next
            curr = next;

        }

        head = prev;

    }

    /**
     * Detect Cycle (Floyd’s Algorithm)
     * Intuition
     * Slow moves 1 step
     * Fast moves 2 steps
     * If there’s a loop → fast will catch slow
     * | Condition      | Meaning      |
     * | -------------- | ------------ |
     * | `fast == null` | No cycle     |
     * | `slow == fast` | Cycle exists |
     *
     */
    boolean hasCycle() {
        Node fast = head;
        Node slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    void createCycle(BasicLinkedList basicLinkedList) {
        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = basicLinkedList.head.next;
    }

    Node findCycleStart() {
        Node slow = head;
        Node fast = head;
        // Step 1: Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // No cycle
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 2: Move slow to head
        slow = head;

        // Step 3: Move both one step
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow; // cycle start

    }

    /**
     * Keep moving one pointer until it comes back
     * Count steps = length
     *
     */
    int cycleLength() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                int count = 1;
                Node temp = slow.next;

                while (temp != slow) {
                    count++;
                    temp = temp.next;
                }

                return count;
            }
        }

        return 0;
    }

    /**
     * Find cycle start
     * Go to last node of cycle
     * Break the link (next = null)
     *
     */
    void removeCycle() {
        Node start = findCycleStart();
        if (start == null) return;
        Node temp = start;

        // Find last node of cycle
        while (temp.next != start) {
            temp = temp.next;
        }

        // Break cycle
        temp.next = null;
    }

    Node findMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {
        BasicLinkedList basicLinkedList = new BasicLinkedList();

        //Insert at head
        basicLinkedList.insertAtHead(50);
        basicLinkedList.insertAtHead(39);

        //Insert at tail
        basicLinkedList.insertAtTail(88);
        basicLinkedList.insertAtTail(20);
        basicLinkedList.insertAtTail(35);

        System.out.println("Before remove");
        basicLinkedList.printList();

        basicLinkedList.removeData(20);

        System.out.println("After remove");
        basicLinkedList.printList();

        basicLinkedList.reverse();
        System.out.println("After Reverse");
        basicLinkedList.printList();


        // Floyd's Algorithm
        basicLinkedList.insertAtTail(10);
        basicLinkedList.insertAtTail(20);
        basicLinkedList.insertAtTail(30);
        basicLinkedList.insertAtTail(40);
        basicLinkedList.insertAtTail(50);

        System.out.println("Before cycle Detect Cycle (Floyd’s Algorithm): " + basicLinkedList.hasCycle());
        // Create cycle
        basicLinkedList.createCycle(basicLinkedList);
        System.out.println("Detect Cycle (Floyd’s Algorithm): " + basicLinkedList.hasCycle());

        // Cycle start
        System.out.println("Cycle start from: " + basicLinkedList.findCycleStart().data);

        //Cycle length
        System.out.println("Cycle length: " + basicLinkedList.cycleLength());

        // Remove Cycle
        System.out.println("Before remove cycle");
//        basicLinkedList.printList(); // It will create infinite loop

        basicLinkedList.removeCycle();

        System.out.println("After remove cycle");
        basicLinkedList.printList();

        System.out.println("Find middle: " + basicLinkedList.findMiddle().data);

    }

}