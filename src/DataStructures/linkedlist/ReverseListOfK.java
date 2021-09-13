package DataStructures.linkedlist;

import java.util.Stack;

public class ReverseListOfK {

    public static Node reverse(Node head, int k) {
        // Create a stack of Node*
        Stack<Node> sn = new Stack<Node>();

        Node current = head;
        Node prev = null;

        while (current != null) {
            int count = 0;
            while (current != null && count < k) {
                sn.push(current);
                current = current.next;
                count++;
            }
            while (sn.size() > 0) {
                if (prev == null) {
                    prev = sn.pop();
                    head = prev;
                } else {
                    prev.next = sn.pop();
                    prev = prev.next;
                }
            }
        }
        prev.next = null;

        return head;
    }

    public static void main(String[] args) {

        LinkedList ls = new LinkedList();

        ls.addFirst(1);
        ls.addFirst(2);
        ls.addFirst(3);
        ls.addFirst(4);
        ls.addFirst(5);
        ls.addFirst(6);
        ls.addFirst(7);
        ls.addFirst(8);

        ls.print();
        ls.head = reverse(ls.head, 3);
        ls.print();
    }
}