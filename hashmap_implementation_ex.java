import java.util.*;

// impllemment with array of linked list


//put() =O(lamda(^))  n/N=^(lamda)
public class hashmap_implementation_ex {

    static class HashMap<k,v>
    {
        private class node
        {
            k key;
            v value;
            public node(k key,v  value)
            {
                this.key=key;
                this.value=value;
            } 

        }
        private int n ;
        private int N;
        private LinkedList<node> bucket[];//n=buchets.length


        @SuppressWarnings("unchecked")
        public HashMap()
        {
            this.N =4;
            this.bucket=new LinkedList[4];
            for(int i=0;i<4;i++)
            {
                this.bucket[i]=new LinkedList<>();
            }
        }

        private  int hashfunnction(k key)
        {
            int bi =key.hashCode();
            return Math.abs(bi)%N;

        }

        private  int serchInLL(k key , int bi)
        {
            LinkedList <node> ll=bucket[bi];
            int di=0;
            for(int i =0;i<ll.size();i++)
            {
                if(ll.get(i).key==key)
                {
                    return i;
                }
            }
            return -1;
        }

        private void rehash()
        {
            LinkedList<node> oldbucket[]=bucket;
            bucket=new LinkedList[N*2];

            for(int i=0;i<N*2;i++)
            {
                bucket[i]=new LinkedList<>();
            }
            for(int i=0;i<oldbucket.length;i++)
            {
                LinkedList <node> ll=oldbucket[i];
                for(int j=0;j<ll.size();j++)
                {
                    node Node=ll.get(j);
                    put(Node.key,Node.value);
                }
            }
        }
        public void put(k key, v value)
        {
            int bi= hashfunnction(key);
            int di=serchInLL(key,bi);//data index
            if(di==-1)
            {
                bucket[bi].add(new node(key, value));
                n++;
            }
            else{
                //key exists
                node data=bucket[bi].get(di);
                data.value=value;
            }
            double  lamda=(double)n/N;
            if(lamda>2.0)
            {
                //rehashing

            }

        }

        public boolean containsKey(k key)
        {
            return false;
        }
        public v remove(k key)
        {
            return null;
        }

    }
    
}
