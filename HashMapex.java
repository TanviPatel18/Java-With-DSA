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
    }
}
