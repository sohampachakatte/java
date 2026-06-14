import java.util.List;

public class LinkedList {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // addFirst

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    // with tail addLast

    // public void addLast(int data) {
    // Node newNode = new Node(data);
    // if (head == null) {
    // head = tail = newNode;
    // }
    // tail.next = newNode;
    // tail = newNode;
    // }

    // withOut tail addLast

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = null;
        }

        Node trav = head;
        while (trav.next != null) {
            trav = trav.next;
        }
        trav.next = newNode;
    }

    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("Null");
    }

    public void addPosition(int data, int pos) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            Node trav = head;
            for (int i = 1; i < pos - 1; i++) {
                trav = trav.next;
            }
            newNode.next = trav.next;
            trav.next = newNode;

        }
    }

    public static Node head;
    public static Node tail;

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("LinkedList : ");
        // list.addFirst(3);
        // list.addFirst(2);
        // list.addFirst(1);
        // list.addLast(4);
        // list.addLast(5);
        list.addPosition(1, 1);
        list.addPosition(2, 2);
        list.addPosition(3, 3);
        list.addPosition(6, 3);
        list.printLinkedList();

    }
}