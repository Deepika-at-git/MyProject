package DataStructures.linkedlist;

public class NFromLast {

    static int getnFromLast(Node head, int n) {

        Node p1 = head;
        Node p2 = head;
        Node current = head;
        int count = 1;
        int x = 0;
        while (current != null) {
            current = current.next;
            x++;
        }

        while (p2 != null && n <= x) {
            while (p2 != null && count < n) {
                p2 = p2.next;
                count++;
            }
            while (p2 != null && p2.next != null) {
                p2 = p2.next;
                p1 = p1.next;
            }
            return p1.val;
        }
        return -1;
    }

    public static void main(String[] args) {

        LinkedList ls = new LinkedList();
        ls.addFirst(-8);
        ls.addFirst(8);
//        ls.addFirst(9);
//        ls.addFirst(-12);
//        ls.addFirst(4);
//        ls.addFirst(8);
//        ls.addFirst(-6);
//        ls.addFirst(6);
        ls.print();
        int x = getnFromLast(ls.head, 3);
        System.out.println();
        System.out.println("Nth element from last is " + x);


    }

}
