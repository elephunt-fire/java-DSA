package HashMap;

import java.util.*;

public class first {
//        here Integer : is used as a wrapper class, here we can store Null object also.
//        boolean => Boolean
//        Char => Character
        // int : for logic.

    public static void main(String[] args) {
        HashMap<String,Integer> hmap = new HashMap<>();
        // insert data in HashMap
        hmap.put("A" , 1) ;
        hmap.put("A" , 11) ; // "A" = 11 not 1 as the value is updated.
        hmap.put("y" , 3) ;
        hmap.put("u" , 4) ;
        hmap.put("s" , 5) ;
        hmap.put("H" , 6) ;
        // printing HashMap
        System.out.println(hmap);

        // get value by key
        System.out.println(hmap.get("A"));
        System.out.println(hmap.get("Y")); // not containing key in the hashmap.

        // remove from hashmap
        hmap.remove("H");
        System.out.println("deleting 'H' : "+hmap);
        System.out.println();

        // contains any keys -> boolean return
        System.out.println("Checking if 'u' is present or not : "+ hmap.containsKey("u"));
        System.out.println("Checking if 'S' is present or not : "+ hmap.containsKey("S"));
        System.out.println();

        // contains any value - > returns boolean
        System.out.println("checking if 5 is present or not :" +hmap.containsValue(5));
        System.out.println("checking if 80 is present or not :" + hmap.containsValue(80));

        // size of hashmap
        System.out.println("size of hashmap is : "+hmap.size());

        System.out.println();

        // is empty
        System.out.println("is empty() : " + hmap.isEmpty());

        // clear method
        // hmap.clear();
        // System.out.println(hmap);

        // all key of the hashMap
        System.out.println("all keys of the hashmap : "+hmap.keySet());

        // all values
        System.out.println("all values of hashmap : " + hmap.values());
    }
}
