package April_21st_StreamAPI;

import java.util.List;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class StreamMethods {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2, 3, 1, 2, 5, 6, 7, 4, 3, 1);
        System.out.println(list);

        // to perform operations we have to convert this list to stream

        // creates a stream of integer objects in list and stores in s
//        Stream<Integer> s = list.stream();
//        Stream<Integer> s2 = s.distinct();

        // n specifies element in stream s2
//        s2.forEach(n-> System.out.println(n));

        // writing code in single line,i.e., pipelining the ops
        list.stream().distinct().forEach(n-> System.out.println(n));

        // min
        Optional<Integer> optional = list.stream().distinct().min((o1,o2)->o1-o2);
        if(optional.isPresent()) {
            System.out.println(optional.get());
        }

        //max
        Integer i = list.stream().max((o1,o2)->o2-o1).get();
        System.out.println(i);

        System.out.println("--------------------------------------------------------------");

        // sorted()
        list.stream().sorted().forEach(n-> System.out.print(n+" "));
        System.out.println();

        // sorted (comparator)
        list.stream().sorted((o1,o2)->o2-o1).forEach(n-> System.out.print(n+" "));
        System.out.println();

        // map function
        list.stream().distinct().sorted().map(n -> n*n).forEach(n-> System.out.print(n+" "));
        System.out.println();

        // filter(Predicate)
        list.stream().distinct().filter(n -> n%2==0).forEach(n -> System.out.print(n+" "));
        System.out.println();

        // convert stream object back to list
        List<Integer> li = list.stream().distinct().filter(n -> n%2==0).toList();

        // create your own stream
        Stream s = Stream.of(1,4,7,3,"demo",98.6);
        s.forEach(n -> System.out.println(n));
        System.out.println("-----------------------------------------------------------------------");

        // findFirst()
        Optional<Integer> op = list.stream().findFirst();
        System.out.println("First element: "+op.get());

        // findAny()
        System.out.println(list.stream().findAny().get());

        // count()
        System.out.println("No. of elements: "+list.stream().count());

        // concat(Stream,number)
        List<String> strings = Arrays.asList("Hello","demo","hi");
        List<Integer> num = Arrays.asList(1,2,3);

        Stream<String> s1 = strings.stream();
        Stream<Integer> s2 = num.stream();

        Stream.concat(s1,s2).forEach(n -> System.out.print(n+" "));
        System.out.println();

        // allMatch (Predicate)
        System.out.println(list.stream().distinct().allMatch(n -> n%2==0));

        // anyMatch (Predicate)
        System.out.println(list.stream().distinct().anyMatch(n -> n%2==0));

    }
}
