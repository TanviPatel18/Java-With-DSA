import java.util.*;
public class QueueArray {
    //Simple Queue
    // static class QueueA{
    //     static int  arr[];
    //     static  int size;
    //     static int rear= -1;
    //     QueueA(int n)
    //     {
    //         arr = new int[n];
    //         this.size=n;

    //     }

    //     //isempty
    //     public static boolean isEmpty()
    //     {
    //         return rear==-1;
    //     }

    //     //enqueue
    //     public static void add(int data)
    //     {
    //         if(rear== size-1)
    //         {
    //             System.out.println("Queue is full");
    //             return;
    //         }

    //         rear++;
    //         arr[ rear]=data;
    //     }

    //     //deQueue
    //     public static int remove()
    //     {
    //         if (isEmpty()) 
    //         {
    //             System.out.println("Empty Queue");
    //             return -1;
    //         }
    //         int front= arr[0];
    //          for (int i = 0; i < rear; i++) {
    //             arr[i] = arr[i + 1];
    //         }

    //         rear--;

    //         return front;
    //     }

    //     // peek
    //     public static int peek() {
    //         if (isEmpty()) {
    //             System.out.println("Empty Queue");
    //             return -1;
    //         }

    //         return arr[0];
    //     }
    // }


    //circuler Queue
    static class QueueA {
        static int arr[];
        static int size;
        static int front;
        static int rear;

        QueueA(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;
        }

        // isEmpty
        public static boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // isFull
        public static boolean isFull() {
            return (rear + 1) % size == front;
        }

        // add
        public static void add(int data) {

            if (isFull()) {
                System.out.println("Queue Full");
                return;
            }

            // first element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public static int remove() {

            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            int result = arr[front];

            // single element condition
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }

            return result;
        }

        // peek
        public static int peek() {

            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[front];
        }
        
        public static void display() 
        {

            if (isEmpty()) 
            {
                System.out.println("Empty Queue");
                return;
            }

            int i = front;

            while (i != rear) 
            {
                System.out.print(arr[i] + " ");
                i = (i + 1) % size;
            }

            System.out.print(arr[rear]);
            System.out.println();
        }
    }

     public static void main(String args[]) {

        //simple without build in fun:-
         QueueA q = new QueueA(5);
        
        //
        // Queue<Integer> q = new LinkedList<>();

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);


        q.display();


        q.remove();
        q.remove();

        q.add(6);
        q.add(7);

          q.display();

    }
}
