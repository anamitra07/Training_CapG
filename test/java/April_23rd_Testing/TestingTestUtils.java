package April_23rd_Testing;

import org.junit.*;
import April_23rd.TestUtils;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.hasItem;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.*;

public class TestingTestUtils {

    TestUtils utils;
    Scanner sc;

    @Before // used for resource opening annotation
    public void setup() {
        utils = new TestUtils();
        sc = new Scanner(System.in);
    }

    @Test
    public void assertEqualsAddition() {
        System.out.println("Testing add method");
//        System.out.print("Enter first number: ");
//        int a = sc.nextInt();
//        System.out.print("Enter second number: ");
//        int b = sc.nextInt();

        int result = utils.add(10,5);

        assertEquals(15,result);
        //assertNotEquals(13,result);
    }

//    @Test
    @Ignore
    public void assertCheck() {
        List<Integer> data = Arrays.asList(1,2,3,4);
        List list = utils.returnList(null);
        for (Object o : list) {
            //assertTrue(o instanceof Integer);
            Integer i = (Integer) o;
            assertTrue(i%2==0);
        }
    }

    @Test
    public void checkSorted() {
        List<Integer> input = Arrays.asList(5,4,8,6,1);
        List<Integer> expected = Arrays.asList(5,4,8,6,1);
        List<Integer> actual = utils.sortList(input);
        assertEquals(expected, actual);
    }

    @Test
    public void checkSortedList() {
        List<Integer> actual = Arrays.asList(5,4,8,6,1);
        List<Integer> expected = Arrays.asList(5,4,8,6,1);
        assertEquals(expected, actual);
    }

    @Test
    public void checkEqualArray() {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        assertArrayEquals(arr1,arr2);
    }

    @Test
    public void checkException() {
        assertThrows(ArithmeticException.class, () -> {
            utils.div(10,0);
        });
    }

    @Test
    public void checkNull() {
        assertNull(utils.returnString("Demo"));
    }

    @Test
    public void checkNotNull() {
        assertNotNull(utils.returnString("Demo"));
    }

    @Test
    public void checkSame() {
        List<Integer> input = Arrays.asList(5,8,3,4,2,9);
        List<Integer> output = utils.checkSameListAfterModifying(input);
        assertSame(output, input);
    }

    @Test
    public void checkNotSame() {
        List<Integer> input = Arrays.asList(5,8,3,4,2,9);
        List<Integer> output = new ArrayList<>(utils.checkSameListAfterModifying(input));
        assertSame(output, input);
    }

    @Test
    public void checkMatchersInList() {
        List<String> input = Arrays.asList("tom","jerry","spike");
        List<String> output = utils.checkMatchers(input);

        assertThat(output,hasItem("TOM"));
        assertThat(output,hasItems("TOM","JERRY","SPIKE"));
    }


    @After // used for resource closing annotation
    public void resourceClose() {
        this.utils = null;
        sc.close();
    }
}
