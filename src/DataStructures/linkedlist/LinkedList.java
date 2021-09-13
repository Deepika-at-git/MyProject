package DataStructures.linkedlist;

public class LinkedList {

    Node head;

    LinkedList() {
        this.head = null;
    }

    void addFirst(int x) {
        Node a = new Node(x);

        if (head == null) {
            head = a;
        } else {
            a.next = head;
            head = a;
        }

    }

    void addLast(int x) {
        Node a = new Node(x);

        if (head == null) {
            head = a;
        } else {
            Node temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = a;
        }
    }

    void remove(int x) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        if (head.val == x) {
            System.out.println("Node deleted is : " + head.val);
            head = head.next;
            return;
        }
        Node prev = head, cur = head.next;
        while (cur != null && cur.val != x) {
            prev = cur;
            cur = cur.next;
        }
        if (cur != null) {
            System.out.println("Node deleted is " + cur.val);
            prev.next = cur.next;
        } else
            System.out.println("Node not found");
    }

    void print() {
        Node temp = head;
        System.out.println("List of element: ");
        while (temp != null) {

            System.out.print(temp.val + " ");
            temp = temp.next;
        }

    }

    /**
     * Delete the elements in an linked list whose sum is equal to zero
     */
    void sumDelete() {
        Node current = head;
        Node nxt;
        Node temp;

        while (current != null) {
            nxt = current.next;
            temp = nxt.next;

            int sum = current.val + nxt.val;
            if (sum == 0) {
                remove(current.val);
                remove(nxt.val);
                current = temp;
            }

            //int newsum = sum + temp.val;
            else if ((sum + temp.val) == 0) {

                remove(current.val);
                remove(nxt.val);
                current = temp.next;
                remove(temp.val);

            } else {
                current = nxt;
            }

        }
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
        //Test-1
//        ls.addFirst(25);
//        ls.addFirst(20);
//        ls.addFirst(-18);
//        ls.addFirst(10);
//        ls.addFirst(-19);
//        ls.addFirst(10);
//        ls.addFirst(9);
//        ls.addFirst(8);
//        ls.addFirst(-10);
//        ls.addFirst(6);
//        ls.addFirst(4);

        ls.print();
        System.out.println();
//        ls.sumDelete();
//        ls.print();
        //ls.midElement();
        //ls.remove(10);
        //ls.remove(2);
        //ls.print();
        //ls.remove(3);
        //ls.print();
        //ls.remove(-1);

        //ls.print();
    }

}

