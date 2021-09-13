package DataStructures.linkedlist;

public class ReverseLinkedList {


    public static Node reverseList(Node head) {

        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }

    public static void main(String[] args) {
        LinkedList rl = new LinkedList();

        rl.addFirst(5);
        rl.addFirst(4);
        rl.addFirst(3);
        rl.addFirst(2);
        rl.addFirst(1);

        rl.print();

        rl.head = reverseList(rl.head);
        System.out.println("Reverse Linked list:");

        rl.print();
    }

}
