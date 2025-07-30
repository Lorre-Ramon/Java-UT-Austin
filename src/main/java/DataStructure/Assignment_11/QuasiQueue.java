package DataStructure.Assignment_11;

public class QuasiQueue<Objects> {

    // Use two Objects of Class Queue to implement a new Class Stack

    Stack stack1 = new Stack<>();
    Stack stack2 = new Stack<>();

    public void enqueue(Objects value) {
        this.stack1.push(value);
    }

    public Objects dequeue() {
        while (stack1.peek() != null) {
            Objects temp = (Objects) this.stack1.pop();
            this.stack2.push(temp);
        }

        Objects returnValue = (Objects) this.stack2.pop();

        while (stack2.peek() != null) {
            Objects temp = (Objects) this.stack2.pop();
            this.stack1.push(temp);
        }

        return returnValue;

    }

    public static void main(String[] args) {

        QuasiQueue<Integer> myQQueue = new QuasiQueue<Integer>();

        myQQueue.enqueue(10);
        myQQueue.enqueue(20);
        myQQueue.enqueue(30);
        myQQueue.enqueue(40);

        System.out.println(myQQueue.dequeue());
        System.out.println(myQQueue.dequeue());
        System.out.println(myQQueue.dequeue());
        System.out.println(myQQueue.dequeue());
        System.out.println(myQQueue.dequeue());

    }

}
