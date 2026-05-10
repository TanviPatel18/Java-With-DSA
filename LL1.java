// import java.security.PublicKey;

public class LL1 {
    node head;
    private  int size;
    LL1()
    {
        this.size=0;
    }
    class node{
        String data;
        node next;
        node(String data)
        {
            this.data=data;
            this.next=null;
            size++;
        }
    }
        //ADD - FIRST , LAST
        public  void addfirst(String data)
        {
            node newnode = new node(data);
            if(head == null)
            {
                head = newnode;
                return;
            }
            newnode.next= head;//1, 2,3 head  2 par chhe?
            head=newnode;//head  1 par thai jase
        }
        //add last
        public void addlast(String data)
        {
            node newnode=new node(data);
            if(head==null)
            {
                head=newnode;
                return;
            }
            node currnode = head;
            while (currnode.next !=null) 
            {
                currnode=currnode.next;
            }
            currnode.next=newnode;
        }
        //print
        public void print()
        {
            if(head==null)
            {
                System.out.println("list is null");
                return;
            }
            node currnode = head;
            while (currnode !=null) 
            {
                System.out.print(currnode.data+" --> ");
                currnode=currnode.next;
            }
            System.out.print("null");
            System.out.println();
            
        }
        //delete first
        public void deletefirst()
        {
            if(head==null)
            {
                System.out.println("list is null");
                return;
            }
            size--;
            head=head.next;
        }

        //delete last
        public void deletelast()
        {
            if(head==null)
            {
                System.out.println("list is null");
                return;
            }
            size--;
            if(head.next==null)
            {
                head=null;
                return;
            }
            node secondlast=head;
            node lastnode=head.next;// head.next==null-> lastnode= null
            while(lastnode.next !=null)//null.next=error
            {
                lastnode=lastnode.next;
                secondlast=secondlast.next;
            }
            secondlast.next=null;
        }

    public int getsize()
    {
        return size;
    }

    public void reverseIterate()
    {
        if(head==null || head.next==null)
        {
            return;
        }
        node prenode=head;
        node currnode2= head.next;
        while (currnode2 != null) {
            node nextnode=currnode2.next;
            currnode2.next=prenode;

            prenode=currnode2;
            currnode2=nextnode;
        }
        head.next=null;
        head=prenode;
    }
    public node reverseRecursive(node head)
    {
        if(head==null || head.next==null)
        {
            return head;
        }
        node newhead= reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;

        return newhead;

    }

    
    public static void main(String[] args) {
        LL1 list = new LL1();
        // INSORT, DELETE , PRINT,SIZE 
        list.addfirst("a");
        list.addfirst("b");

        list.addlast("c");
        list.addfirst("a1");
        list.addlast("d");
        list.print();

        list.reverseIterate();
        list.print();

        list.head=list.reverseRecursive(list.head);
        list.print();
    }
    
}
