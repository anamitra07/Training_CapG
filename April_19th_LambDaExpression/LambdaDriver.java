package April_19th_LambDaExpression;

import java.util.*;

public class LambdaDriver {
    public static void main(String[] args) {
        Demo1 d1 = () -> System.out.println("Hello");
        d1.print();

        Demo2 d2 = () -> System.out.println("Hello");
        d2.greet();

        Demo3 d3 = (a,b) -> {
            if(a>b)
                return a;
            else
                return b;
        };
        System.out.println(d3.check(10,20));

        // We want to sort in descending order
        // You must not create another class.
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println(list);
        Comparator<Integer> comparator = (o1,o2) -> o2-o1;
        Collections.sort(list, comparator);
        System.out.println(list);

    }
}
