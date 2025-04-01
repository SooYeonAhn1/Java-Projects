public class Test {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(3);
        s.push(5);
        while (!s.isEmpty()) {
            int val = s.pop();
            System.out.println(val);
        }
    }
}
