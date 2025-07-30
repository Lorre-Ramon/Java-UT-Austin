package DataStructure.Assignment_11;

import java.util.ArrayDeque;
import java.util.Objects;

public class Stack<Objects> {

    // first in last out

    // attributes
    ArrayDeque<Objects> stack = new ArrayDeque<Objects>();

    // Constructor
    public Stack() {
    }

    // Methods
    public void push(Objects userValue) {
        this.stack.addFirst(userValue);
    }

    public Objects pop() {
        return this.stack.pollFirst();
    }

    public Objects peek() {
        Objects peekValue = this.stack.pollFirst();
        if (peekValue != null) {
            this.stack.addFirst(peekValue);
        }
        return peekValue;
    }

    public static void main(String[] args) {

        Stack<Integer> myStack = new Stack<Integer>();
        myStack.push(10);
        myStack.push(20);
        myStack.push(30);

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
    }
}
