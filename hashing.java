
//hash set

// insert/ add= o(1)
// delete/remove=o(1)
// search / contains = o(1)

import java.util.HashSet;
import java.util.Iterator;;
public class hashing {
    public static void main(String[] args) {
        //creating
        HashSet<Integer>  set=new HashSet<>();

        // insert
        set.add(1);//like array list we use  list.add(el);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(5);


        //size
        System.out.println("size of set :- "+set.size());
        
        //printing all the element
        System.out.println(set);


        //serch
        if(set.contains(4))
        {
            System.out.println("contain the number");
        }
        if(!set.contains(6))
        {
            System.out.println("not contain this number");
        }


        ///delete 
        set.remove(3);
        if(!set.contains(3))
        {
            System.out.println("3 removed");
        }

    }
    
}
