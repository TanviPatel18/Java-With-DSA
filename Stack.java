import java.util.*;

public class Stack {
    static class Node{
        int data;
        Node next;
        public Node(int data)
        {
            this.data=data;
            next=null;
        }
    }

    static class stack1{
        public static Node head;
        public static boolean isEmpty()
        {
             return head==null;
        }
        public static void PUSH(int data)
        {
            Node newnode= new Node(data);
            if(isEmpty())
            {
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }

        public static int POP()
        {
            if(isEmpty())
                return -1;
            int top= head.data;
            head=head.next;
            return top;
        }
        public static int PEEK()
        {
            if(isEmpty())
                return -1;
            return head.data;
            
        }


    }
    public static void main(String[] args) {
        // POP 0(1)   PUSH 0(1)  PEEK 0(1)
        //  LAST IN FIRAT OUT.(LIFO)

        stack1 s =new stack1();
        s.PUSH(1);
        s.PUSH(2);
        s.PUSH(3);
        
        System.out.println("Removed: " + s.POP());
        System.out.println("Top: " + s.PEEK());
    }
}
