public class Queue {
    static class QueueA{
        static int  arr[];
        static  int size;
        static int rear= -1;
        QueueA(int n)
        {
            arr = new int[n];
            this.size=n;

        }

        //isempty
        public static boolean isEmpty()
        {
            return rear==-1;
        }

        //enqueue
        public static void add(int data)
        {
            if(rear== size-1)
            {
                System.out.println("Queue is full");
                return;
            }

            rear++;
            arr[ rear]=data;
        }

        //deQueue
        public static int remove()
        {
            if (isEmpty()) 
            {
                System.out.println("Empty Queue");
                return -1;
            }
            int front= arr[0];
             for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }

            rear--;

            return front;
        }

        // peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[0];
        }
    }
     public static void main(String args[]) {

        QueueA q = new QueueA(5);

        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
