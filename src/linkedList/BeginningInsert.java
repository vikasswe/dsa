package linkedList;

public class BeginningInsert {
    Node head;

    void insertBegnning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void display(){
        Node temp = head;

        while (temp != null){
            System.out.println(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        BeginningInsert beginningInsert = new BeginningInsert();

        beginningInsert.insertBegnning(10);
        beginningInsert.insertBegnning(20);
        beginningInsert.insertBegnning(30);
        beginningInsert.insertBegnning(40);

        System.out.println("Original List -> ");
        beginningInsert.display();

        beginningInsert.insertBegnning(5);

        System.out.println("After inserting 5");
        beginningInsert.display();
    }

}



