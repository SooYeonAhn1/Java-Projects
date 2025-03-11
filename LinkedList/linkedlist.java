import java.lang;

public class LinkedList {
    private Node head;
    private int size;

    private static Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public LinkedList() {
        this.head = null;
        this.size = 0;
    }

    public void add(T data) {
        Node<T> node = new Node(data);

        if (!this.head) {
            this.head = node;
        } else {
            Node<T> curr = this.head;
            while (curr.next) {
                curr = curr.next;
            }
            curr.next = node;
        }

        this.size++;
    }

    public void add(int index, T data) {
        if (index >= this.size || index < 0) {
            throw new IndexOutOfBoundsException("index has to be non-negative or less than " + this.size);
        }

        Node<T> node = new Node(data);
        Node<T> prev = null;
        Node<T> curr = this.head;
        int idx = 0;

        while (idx < index) {
            prev = curr;
            curr = curr.next;
            idx++;
        }

        node.next = curr;
        if (prev) {
            prev.next = node;
        }
        if (curr == this.head) {
            this.head = node;
        }

        this.size++;
    }

    public void add(Node<T> node) {
        if (!node) {
            throw new NullPointerException("Node cannot be null");
        }
        add(node.data);
    }

    public void add(int index, Node<T> node) {
        if (!node) {
            throw new NullPointerException("Node cannot be null");
        }
        add(index, node.data);
    }

    public void remove() {
        if (!this.head) {
            throw new NullPointerException("Nothing to delete");
        }
        this.head = this.head.next;
        size--;
    }

    public void remove(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("index has to be non-negative and less than " + this.size);
        }
        int idx = 0;

        Node<T> prev = null, curr = this.head;
        while (idx < index) {
            prev = curr;
            curr = curr.next;
            idx++;
        }
        prev.next = curr.next;
        size--;
    }

    public T getAt(int index) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("index has to be non-negative and less than " + this.size);
        }
        int idx = 0;

        Node<T> curr = this.head;
        while (idx < index) {
            curr = curr.next;
            idx++;
        }
        return curr.data;
    }

    public void setAt(int index, T data) {
        if (index < 0 || index >= this.size) {
            throw new IndexOutOfBoundsException("index has to be non-negative and less than " + this.size);
        }
        int idx = 0;

        Node<T> curr = this.head;
        while (idx < index) {
            curr = curr.next;
            idx++;
        }
        curr.data = data;
    }

    public void clear() {
        this.head = null;
        this.size = 0;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }
}
