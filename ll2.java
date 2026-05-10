import java.util.*;//linklist

// import LL.node;

public class ll2 
{
    class Listnode {
        int data;
        Listnode next;

        Listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    //find the nth node from last + delete the nth node

    public Listnode removeNthnode(Listnode head, int n)
    {
        if(head.next==null)
        {
            return null;
        }

        int size=0;
        Listnode curr=head;
        while(curr != null)
        {
            curr=curr.next;
            // curr++;
            size++;
        }
        if(n==size)
        {
            return head.next;
        }
        int indextosearch= size-n;
        Listnode perv=head;
        int i=1;
        while(i<indextosearch)
        {
            perv=perv.next;
            i++;
        }
        perv.next=perv.next.next;
        return head;
    }
    public void printList(Listnode head) {
        Listnode curr = head;

        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
    public static void main(String[] args) {

        ll2 list = new ll2();

        // create nodes
        Listnode head = list.new Listnode(1);
        head.next = list.new Listnode(2);
        head.next.next = list.new Listnode(3);
        head.next.next.next = list.new Listnode(4);
        head.next.next.next.next = list.new Listnode(5);

        System.out.println("Original List:");
        list.printList(head);

        // remove 2nd node from end
        head = list.removeNthnode(head, 2);

        System.out.println("After Deletion:");
        list.printList(head);
    }
}
