package InterviewQuestions.java.stacks;

public class ImplementStackUsingArray {

    public static class myStack {

        int size;
        int[] arr;
        int top;

        myStack(int size) {
            this.size = size;
            this.arr = new int[size];
            this.top = -1;
        }

        public void push(int pushElement) {
            if (isFull()) {
                System.out.println("Stack is full");
            } else {
                arr[++top] = pushElement;
                System.out.println("Element pushed is " + pushElement);
            }
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            } else {
                int topElement = arr[top];
                top--;
                System.out.println("Element popped is:" + " " + topElement);
                return topElement;
            }

        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            } else {
                System.out.println("Peek Top element is:" + " " + arr[top]);
                return arr[top];
            }
        }

        public boolean isFull() {
            return (size - 1 == top);
        }

        public boolean isEmpty() {
            return (top == -1);
        }

    }

    public static void main(String[] args) {

        myStack obj = new myStack(10);
        obj.pop();
        System.out.println("-----------");
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(20);
        obj.push(30);
        obj.push(40);
        obj.push(50);
        obj.push(60);
        obj.push(70);
        obj.push(80);
        System.out.println("-----------");
        obj.pop();
        obj.pop();
        System.out.println("-----------");
        obj.peek();
        System.out.println("-----------");
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();
        obj.pop();

    }

}



