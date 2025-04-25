package AprIl_17th_HashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add(10);
        set.add(10.75);
        set.add("Hello");
        set.add(10.75);
        set.add(20);
        set.add(null);
        System.out.println(set);
    }
}
