package DataStructure.Assignment_11;

public class QuasiStack {

    // (in) 10, 20, 30, 40 (out)

    private Queue queue1 = new Queue();
    private Queue queue2 = new Queue();

    public void push(Object o) {
        this.queue1.enqueue(o);
    }

    public Object pop() {

        Object returnVal;

        int n1 = this.queue1.size();
        for (int i = 0; i < n1 - 1; i++) {
            this.queue2.enqueue(this.queue1.dequeue());
        }
        returnVal = this.queue1.dequeue();

        int n2 = this.queue2.size();
        for (int i = 0; i < n2; i++) {
            this.queue1.enqueue(this.queue2.dequeue());
        }

        return returnVal;
    }

    public Object peek() {
        Object returnVal;

        int n1 = this.queue1.size();
        for (int i = 0; i < n1 - 1; i++) {
            this.queue2.enqueue(this.queue1.dequeue());
        }
        returnVal = this.queue1.dequeue();
        this.queue2.enqueue(returnVal);

        int n2 = this.queue2.size();
        for (int i = 0; i < n2; i++) {
            this.queue1.enqueue(this.queue2.dequeue());
        }

        return returnVal;
    }

    public static void main(String[] args) {
        QuasiStack myStack = new QuasiStack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}
