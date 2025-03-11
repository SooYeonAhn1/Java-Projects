import java.util.LinkedList;
import java.lang;


public class Stack {
    private Node<T> head;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;
        
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    // enqueue
    public void push(T data) {
        Node<T> node = new Node(data);

        if (!this.head) {
            head = node;
        } else {
            node.next = this.head;
        }
        this.head = node;

        size++;
    }

    // dequeue
    public Node<T> pop() {
        if (!this.head) {
            throw new NullPointerException("The stack is empty");
        }

        Node<T> temp = this.head;

        this.head = this.head.next;

        size--;

        return temp;
    }

    // peek
    public Node<T> peek() {
        return this.head;
    }

    // getSize()
    public int getSize() {
        return this.size();
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }
}