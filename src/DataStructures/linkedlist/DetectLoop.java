package DataStructures.linkedlist;

public class DetectLoop {

    static boolean loopList(Node head) {

        Node slow_p = head;
        Node fast_p = head;

        while (fast_p != null && fast_p.next != null) {
            fast_p = fast_p.next.next;
            slow_p = slow_p.next;

            if (fast_p == slow_p) {
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args) {

        LinkedList ls = new LinkedList();

        //Test-0
        ls.addFirst(-8);
        ls.addFirst(8);
        ls.addFirst(9);
        ls.addFirst(-12);
        ls.addFirst(4);
        ls.addFirst(8);
        ls.addFirst(-6);
        ls.addFirst(6);

        boolean result = loopList(ls.head);
        System.out.println(result);

        Node temp = ls.head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = ls.head;

        boolean r = loopList(ls.head);
        System.out.println(r);

    }


}
