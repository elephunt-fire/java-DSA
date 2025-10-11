package Hashset;

import java.util.HashSet;

public class first {
    public static void main(String[] args) {
        HashSet<Integer> hset = new HashSet<>();
        hset.add(1);
        hset.add(2);
        hset.add(1);

        System.out.println(hset);

        hset.remove(1);
        System.out.println(hset);

        System.out.println(hset.contains(1));

    }
}
