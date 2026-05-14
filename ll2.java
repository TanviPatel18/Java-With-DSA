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

    // public Listnode removeNthnode(Listnode head, int n)
    // {
    //     if(head.next==null)
    //     {
    //         return null;
    //     }

    //     int size=0;
    //     Listnode curr=head;
    //     while(curr != null)
    //     {
    //         curr=curr.next;
    //         // curr++;
    //         size++;
    //     }
    //     if(n==size)
    //     {
    //         return head.next;
    //     }
    //     int indextosearch= size-n;
    //     Listnode perv=head;
    //     int i=1;
    //     while(i<indextosearch)
    //     {
    //         perv=perv.next;
    //         i++;
    //     }
    //     perv.next=perv.next.next;
    //     return head;
    // }


    // PALINDROMIC LOOK SAME FROM START AND END...   1-> 2 -> 2 -> 1 -> NULL

    public Listnode  findmiddle(Listnode head)//here turtle
    {
        Listnode hare= head;
        Listnode turtle=head;
        while(hare.next != null&& hare.next.next !=null)
        {
            hare= hare.next.next;
            turtle=turtle.next;

        }
        return turtle;

    }

    public Listnode reverse(Listnode head)
    {
        Listnode perv= null;
        Listnode curr=head;
        while(curr !=null)
        {
            Listnode next =curr.next;
            curr.next=perv;
            perv=curr;
            curr=next;
        }
        return perv;
    }


    public boolean isPalidrame(Listnode head)
    {
        if(head==null|| head.next==null)
        {
            return true;
        }
        Listnode middle =findMiddle(head);
        Listnode second_half_start= reverse(middle.next);
        Listnode first_half_start= head;

        while(second_half_start != null)
        {
            if(first_half_start.val != second_half_start.val)
            {
                return false;
            }
            first_half_start=first_half_start.next;
            second_half_start=second_half_start.next;
        }
        return true;
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
        // head = list.removeNthnode(head, 2);

        System.out.println("After Deletion:");
        list.printList(head);
    }
}
