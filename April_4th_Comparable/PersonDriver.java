package April_4th_Comparable;

public class PersonDriver {
    public static void main(String[] args) {
        Person p1 = new Person("Ram", 50);
        Person p2 = new Person("Raj", 40);

        compareBasedOnName(p1,p2);
    }
    public static void compareBasedOnName(Person p1, Person p2) {
        if (p1.compareTo(p2) > 0) {
            System.out.println("p1 is greater");
        } else if (p1.compareTo(p2) < 0) {
            System.out.println("p2 is greater");
        } else {
            System.out.println("p1 and p2 are equal");
        }
    }
}