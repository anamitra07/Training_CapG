package April_17th_TreeSet;

import java.util.*;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(10);
        ts.add(2);
        ts.add(8);
        ts.add(30);
        ts.add(1);

        System.out.println(ts);

        // For documentation, refer to "https://docs.oracle.com/javase/8/docs/api/java/util/TreeSet.html"
        System.out.println(ts.ceiling(3));
        System.out.println(ts.headSet(3));
        System.out.println(ts.headSet(3, true));
        System.out.println(ts.lower(10));
        System.out.println(ts.lower(1));

        SortedSet<Integer> ss = ts.tailSet(8);
        System.out.println(ss);

        NavigableSet<Integer> n = ts.tailSet(8,true);
        System.out.println(n);

        NavigableSet<Integer> m = ts.tailSet(8,false);
        System.out.println(m);

        // Descending iterator
        Iterator<Integer>
                iterator = ts.descendingIterator();

        System.out.println("\nValues using DescendingIterator:");

        // printing the integrated value
        while (iterator.hasNext()) {
            System.out.println("Value : "
                    + iterator.next());
        }
    }
}
