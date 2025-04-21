package April_21st_StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DemoTasks {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4);
        List<String> list2 = Arrays.asList("Hello","World","Demo");

        System.out.println(list.stream().mapToInt(Integer::intValue).average());


        System.out.print("Sum of even: ");
        System.out.println(list.stream().filter(n -> n%2==0).mapToInt(Integer::intValue).sum());
        System.out.print("Sum of odd: ");
        System.out.println(list.stream().filter(n -> n%2!=0).mapToInt(Integer::intValue).sum());

        System.out.print("After removing duplicates: ");
        list.stream().distinct().forEach(n -> System.out.print(n+" "));

        list2.stream().forEach(n -> 
        });
    }
}
