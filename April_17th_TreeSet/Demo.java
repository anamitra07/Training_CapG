package April_17th_TreeSet;

import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        // Throws NullPointerException
//        set.add(null);
//        set.add(10);
//        set.add("Hello");

        // Sorts in ascending order and removes duplicates.
        set.add(20);
        set.add(10);
        set.add(30);
        set.add(20);

        System.out.println(set);
    }
}
