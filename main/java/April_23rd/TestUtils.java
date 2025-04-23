package April_23rd;

import java.util.Collections;
import java.util.List;

public class TestUtils {

    public int add(int x, int y) {
        return x+y;
    }

    public List<Integer> returnList(List<Integer> list) {
        return list;
    }

    public List<Integer> sortList(List<Integer> list) {
        return list.stream().sorted().toList();
    }

    public int div(int x, int y) throws ArithmeticException{
        if(y!=0) {
            return x/y;
        }
        throw new ArithmeticException("The denominator is 0!!");
    }

    public String returnString(String s) {
        if(s.startsWith("H"))
            return s;
        else
            return null;
    }

    public List<Integer> checkSameListAfterModifying(List<Integer> list) {
        Collections.sort(list);
        return list;
    }

    public List<String> checkMatchers(List<String> list) {
        return list.stream().map(String::toUpperCase).toList();
    }
}
