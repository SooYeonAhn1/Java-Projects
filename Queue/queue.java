import java.util.LinkedList;

public class Queue<T> {
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

        if (this.tail == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;

        size++;
    }

    // dequeue
    public T remove() {
        if (this.head == null) {
            throw new NullPointerException("The queue is empty");
        }

        Node<T> temp = this.head;

        this.head = this.head.next;

        if (this.head == null) {
            this.tail = null;
        }

        size--;

        return temp.data;
    }

    // peek
    public Node<T> peek() {
        return this.head;
    }

    // getSize()
    public int getSize() {
        return this.size;
    }

    // clear()
    public void clear() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // isEmpty()
    public boolean isEmpty() {
        return this.size == 0;
    }
}