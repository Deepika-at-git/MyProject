package DataStructures.linkedlist;

public class FlattenLinkedList {

    Node head;

    Node merge(Node a, Node b) {
        Node result;

        if (a == null)
            return b;
        if (b == null)
            return a;

        if (a.val < b.val) {
            result = a;
            result.down = merge(a.down, b);
        } else {
            result = b;
            result.down = merge(a, b.down);
        }

        result.right = null;
        return result;
    }

    Node flatten(Node root) {
        if (root == null || root.right == null) {
            return root;
        }

        root.right = flatten(root.right);

        root = merge(root, root.right);

        return root;
    }

    Node push(Node head_ref, int val) {

        Node new_node = new Node(val);

        new_node.down = head_ref;
        head_ref = new_node;
        return head_ref;
    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.down;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        FlattenLinkedList L = new FlattenLinkedList();

        L.head = L.push(L.head, 30);
        L.head = L.push(L.head, 8);
        L.head = L.push(L.head, 7);
        L.head = L.push(L.head, 5);

        L.head.right = L.push(L.head.right, 20);
        L.head.right = L.push(L.head.right, 10);

        L.head.right.right = L.push(L.head.right.right, 50);
        L.head.right.right = L.push(L.head.right.right, 22);
        L.head.right.right = L.push(L.head.right.right, 19);

        L.head.right.right.right = L.push(L.head.right.right.right, 45);
        L.head.right.right.right = L.push(L.head.right.right.right, 40);
        L.head.right.right.right = L.push(L.head.right.right.right, 35);
        L.head.right.right.right = L.push(L.head.right.right.right, 28);

        L.head = L.flatten(L.head);

        L.printList();


    }


}
