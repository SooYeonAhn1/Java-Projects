public class Test {
    public static void main(String[] args) {
        Queue<Integer> q = new Queue<>();
        q.enqueue(1);
        q.enqueue(3);
        q.enqueue(5);
        while (!q.isEmpty()) {
            int val = q.remove();
            System.out.println(val);
        }
    }
}
