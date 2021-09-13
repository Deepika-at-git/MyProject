package InterviewQuestions.java.stacks;

public class ImplementStackUsingLinkedList {

    public static class myStackLinked {

        Node head = null;

        class Node {

            int val;
            Node next;

            Node(int val) {
                this.val = val;
                this.next = null;
            }
        }

        public void push(int pushElement) {
            Node newNode = new Node(pushElement);
            newNode.next = head;
            head = newNode;
            System.out.println("Pushed element:" + " " + pushElement);
        }

        public int pop() {
            if (head == null) {

                throw new RuntimeException("Stack underflow");
            } else {

                int pop = head.val;
                head = head.next;
                return pop;
            }
        }

        public int peek() {

            if (head == null) {
                throw new RuntimeException("Stack underflow");
            } else {
                int peekVal = head.val;
                return peekVal;
            }
        }

    }

    public static void main(String[] args) {
        myStackLinked obj = new myStackLinked();
        try {
            obj.peek();
        } catch (RuntimeException e) {
            System.out.println("No elements in the stack to peek");
        }
        try {
            obj.pop();
        } catch (RuntimeException e) {
            System.out.println("No elements to pop");
        }
        obj.push(10);
        obj.push(20);
        obj.push(30);
        int val = obj.pop();
        System.out.println("Element popped is: " + val);
        System.out.println("Element at top is: " + obj.peek());

    }

}
