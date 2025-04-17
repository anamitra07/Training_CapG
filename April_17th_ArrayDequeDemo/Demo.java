package April_17th_ArrayDequeDemo;

import java.util.ArrayDeque;

public class Demo {
    public static void main(String[] args) {
        ArrayDeque ad = new ArrayDeque();
        ad.add(10);
        ad.add(30);
        ad.add(20);
        ad.add(50);
        ad.add(40);

        System.out.println(ad.getFirst()+" "+ad.getLast());
    }
}

// Refer to : "https://docs.oracle.com/javase/8/docs/api/java/util/ArrayDeque.html"