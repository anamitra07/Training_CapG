package April_19th_Map_Collections;

import java.util.*;
import java.util.Map.Entry;

public class TreeMapDemo {
    public static void main(String[] args) {
        // using lambda expression inside constructor
        TreeMap<Integer, String> tm = new TreeMap<>((o1,o2)->(Integer)o2 - (Integer) o1);

        tm.put(5,"Hello");
        tm.put(9,"World");
        tm.put(3,"Everyone");
        tm.put(5,"demo");
        tm.put(7,null);

        System.out.println(tm);
//
//        // containsKey() method
//        System.out.println(tm.containsKey(5));
//        System.out.println(tm.containsKey(2));
//
//        // containsValue() method
//        System.out.println(tm.containsValue("World"));
//        System.out.println(tm.containsValue("Hello"));
//
//        // replace() methods
//        System.out.println(tm.replace(9,"World!!"));
//        System.out.println(tm.replace(3,"Everyone","Class!!"));
//        System.out.println(tm);
//
//        System.out.println(tm.ceilingKey(4));
//

        // Creating a Set
//        Set<Integer> set = tm.keySet();
//        Iterator<Integer> itr1 = set.iterator();
//        while(itr1.hasNext()) {
//            System.out.println(itr1.next());
//        }
//
//        System.out.println("---------------------------");
//
//        Collection<String> c = tm.values();
//        Iterator<String> itr2 = c.iterator();
//        while(itr2.hasNext()) {
//            System.out.println(itr2.next());
//        }
//
//        System.out.println("---------------------------");
//
//        // Iterating through the TreeMap
//        Set<Entry<Integer, String>> s = tm.entrySet();
//        Iterator itr3 = s.iterator();
//        while(itr3.hasNext()) {
//            System.out.println(itr3.next());
//        }
//        System.out.println();
//
//        for(Entry<Integer, String> e: s) {
//            System.out.println(e.getKey()+"---->"+e.getValue());
//        }
//        System.out.println("---------------------------");

        // Creating another TreeMap:
        TreeMap<String, List<String>> map = new TreeMap<>();

        List<String> l1 = Arrays.asList("Hyd","Bangalore","WB");
        List<String> l2 = Arrays.asList("J&K","Assam","Mizoram");
        List<String> l3 = Arrays.asList("Hubli","Dharwad","Bhilwara");

        map.put("SBI",l1);
        map.put("ICICI",l2);
        map.put("Federal",l3);

        Set<Entry<String,List<String>>> s2 = map.entrySet();
        //Iterator itr4 = s2.iterator();
        for(Entry<String, List<String>> e: s2) {
            System.out.println(e.getKey()+"---->"+e.getValue());
        }
        //System.out.println(map);
    }
}
