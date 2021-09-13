package DataStructures.linkedlist;

public class Duplicates {

    public static void removeDuplicate(Node head) {

//        Node current = head;
//        Node nxt;
//        while (current != null) {
//            if (current.next == null) {
//                break;
//            }
//            nxt = current.next;
//
//            if (current.val == nxt.val) {
//                current.next = nxt.next;
//            }
//
//            current = current.next;
//        }

        Node prev = head;
        Node current;
        Node temp;

        while (prev != null) {
            if (prev.next == null) {
                break;
            }
            current = prev.next;
            temp = current.next;

            if (prev.val == current.val) {
                prev.next = temp;
                current = temp;
                //temp = current.next;
            } else {
                prev = current;
                //current = prev.next;
                //temp = current.next;
            }
        }

    }

    public static void main(String[] args) {

        LinkedList ls = new LinkedList();

        ls.addFirst(2);
        ls.addFirst(2);
        ls.addFirst(2);
        ls.addFirst(2);
        ls.addFirst(2);
        ls.addFirst(2);
        ls.addFirst(2);
        ls.addFirst(2);
        ls.print();
        System.out.println();

        removeDuplicate(ls.head);
        ls.print();
    }
}
