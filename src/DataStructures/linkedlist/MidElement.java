package DataStructures.linkedlist;

public class MidElement {

    /**
     * Method1: Finding the middle element of the list
     */
    static void midElement(Node head) {
        Node current = head;

        int count = 0;

        while (current != null) {
            count++;
            current = current.next;
        }
        int mid = count / 2;
        int counter = 0;
        Node header = head;
        while (header != null) {

            if (mid == counter) {
                System.out.println("Middle element of the list is " + header.val);
                break;
            }
            counter++;
            header = header.next;
        }
    }


    // add another approach here

    /**
     * Method2: By using two pointers fast pointer and slow pointer
     */
    static void printMiddle(Node head) {


        Node slow_pointer = head;
        Node fast_pointer = head;

        if (fast_pointer != null) {

            while (fast_pointer != null && fast_pointer.next != null) {
                fast_pointer = fast_pointer.next.next;
                slow_pointer = slow_pointer.next;
            }

            System.out.println("Middle element is " + slow_pointer.val);
        }
    }

    /**
     * Delete the middle element in the list and print the remaining list
     */
    static Node deleteMiddle(Node head) {

        Node slow_pointer = head;
        Node fast_pointer = head;
        Node prev = null;

        if (head == null || head.next == null) {
            return null;
        }
        while (fast_pointer != null && fast_pointer.next != null) {
            prev = slow_pointer;
            fast_pointer = fast_pointer.next.next;
            slow_pointer = slow_pointer.next;

        }
        prev.next = slow_pointer.next;

        return head;
    }


    public static void main(String[] args) {

        LinkedList ls = new LinkedList();

        ls.addFirst(4);
        ls.addFirst(3);
        ls.addFirst(2);
        ls.addFirst(1);
        ls.addLast(5);
        ls.print();
        System.out.println();
        ls.head = deleteMiddle(ls.head);
        ls.print();
        //midElement(ls.head);

    }

}
