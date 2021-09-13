package DataStructures.linkedlist;

import java.util.Stack;

public class ReverseAlternateKNodes {

    static Node reverseKnodes(Node head, int k) {

        Node current = head;
        Node prev = null;
        Stack<Node> sNode = new Stack<Node>();
        boolean reverse = true;

        while (current != null) {

            int count = 0;

            while (current != null && count < k) {
                sNode.push(current);
                count++;
                current = current.next;
            }

            if (reverse) {
                while (sNode.size() > 0) {
                    if (prev == null) {
                        prev = sNode.pop();
                        head = prev;

                    } else {
                        prev.next = sNode.pop();
                        prev = prev.next;
                    }
                }

            } else {
                count = 0;
                while (current != null && count < k) {
                    prev.next = current;
                    count++;
                    current = current.next;
                    prev = prev.next;
                }
            }

            reverse = !reverse;
        }

        return head;
    }

    public static void main(String[] args) {

        LinkedList ls = new LinkedList();

        ls.addFirst(9);
        ls.addFirst(8);
        ls.addFirst(7);
        ls.addFirst(6);
        ls.addFirst(5);
        ls.addFirst(4);
        ls.addFirst(3);
        ls.addFirst(2);
        ls.addFirst(1);

        ls.print();
        ls.head = reverseKnodes(ls.head, 2);
        System.out.println();
        ls.print();
    }

}
