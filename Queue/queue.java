import java.util.LinkedList;
import java.lang;

public class Queue {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;
        
        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // enqueue
    public void enqueue(T data) {
        Node<T> node = new Node(data);

        if (!this.tail) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;

        size++;
    }

    // dequeue
    public Node<T> dequeue() {
        if (!this.head) {
            throw new NullPointerException("The queue is empty");
        }

        Node<T> temp = this.head;

        this.head = this.head.next;

        if (!this.head) {
            this.tail = null;
        }

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

    // clear()
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }
}