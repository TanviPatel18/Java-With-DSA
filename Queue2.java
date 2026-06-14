import java.util.*;

public class Queue2 {

    static class Q {

        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // isEmpty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // add
        public static void add(int data) {

            // move s1 -> s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // add new element
            s1.push(data);

            // move back s2 -> s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove
        public static int remove() {

            if (isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }

            return s1.pop();
        }

        // peek
        public static int peek() {

            if (isEmpty()) {
                System.out.println("Queue Empty");
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String[] args) {

        Q q = new Q();

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println("done");
    }
}