// hash map
//key-value

import java.util.*;

public class HashMapex {
    public static void main(String[] args) {
    //country(key) population(value)
    HashMap < String , Integer>map = new HashMap<>();
    
    // insertion
    map.put("India",120);
    map.put("us",30);
    map.put("chaina", 150);
    System.out.println(map);

    // serch
    if(map.containsKey("chaina"))
    {
        System.out.println("present");
    }
    else
    {
        System.out.println("not present");
    }


    System.out.println(map.get("chaina"));
    System.out.println(map.get("uk"));


    //Iteration

    int arr []={12,25,34};
    for(int i=0;i<3;i++)
    {
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    for(int val:arr)
    {
        System.out.print(val +" ");
    }
    
    System.out.println();
      // HashMap Iteration
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }

    Set<String> keys = map.keySet();
    
    }
}
