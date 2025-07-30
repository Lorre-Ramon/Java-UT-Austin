package DataStructure.Assignment_11;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Objects;

public class Queue<Objects> {

    // attributes
    private LinkedList<Objects> myQueue = new LinkedList<Objects>();

    // skip constructor

    // methods
    public void enqueue(Objects userValue) {
        this.myQueue.addLast(userValue);
    }

    public Objects dequeue() {
        return this.myQueue.pollFirst();
    }

    public int size() {
        return this.myQueue.size();
    }


    public static void main(String[] args) {

        Queue<Integer> myQueue = new Queue<Integer>();

        myQueue.enqueue(10);
        myQueue.enqueue(20);
        myQueue.enqueue(30);
        myQueue.enqueue(40);

        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());
        System.out.println(myQueue.dequeue());

    }
}
