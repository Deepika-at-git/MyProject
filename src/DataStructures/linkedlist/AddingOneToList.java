package DataStructures.linkedlist;

public class AddingOneToList {

/*    static Node addOne(Node head) {

        // Reverse the list
        head = ReverseLinkedList.reverseList(head);

        Node current = head;
        int x = 0;
        while (current != null) {

            if (current.next == null) {
                int sum = current.val + 1;
                if (sum == 10) {
                    current.val = 0;
                    Node n = new Node(1);
                    current.next = n;
                } else {
                    current.val = sum;
                }
            } else if (current.val == 9) {
                current.val = x;
                current = current.next;
            } else if (current.val < 9) {
                current.val = current.val + 1;
                break;
            }
        }

        // Reverse again
        head = ReverseLinkedList.reverseList(head);

        return head;
    }*/

    static Node add(Node head) {
        head = ReverseLinkedList.reverseList(head);

        Node current = head;
        Node prev = current;
        int carry = 1;

        while (current != null) {
            prev = current;
            // get the sum
            int sum = current.val + carry;
            if (sum == 10) {
                current.val = 0;
            } else {
                current.val = sum;
                carry = 0;
            }
            current = current.next;
        }

        if (carry == 1) {
            Node n = new Node(carry);
            prev.next = n;
        }

        head = ReverseLinkedList.reverseList(head);

        return head;
    }

    public static void main(String[] args) {

        LinkedList ls = new LinkedList();

        ls.addFirst(9);
        ls.addFirst(8);

//        ls.addFirst(1);


        ls.print();
        System.out.println();

        ls.head = add(ls.head);
        ls.print();


    }

}
