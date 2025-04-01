package April_1st_Object_and_String_Class;

public class DriverEmp {
    public static void main(String[] args) throws Exception{
        Employee emp1 = new Employee("Ram",1,2000);
        Employee emp2 = new Employee("Ram",1,2000);

        System.out.println("\nTesting equals() method: ");
        System.out.println(emp1);
        System.out.println(emp1.equals(emp2));

        System.out.println("\nTesting hashcode() method: ");
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());

        String s = "Ram";
        System.out.println(s.hashCode());

        System.out.println("\nTesting clone() function: ");
        //Employee e = emp1.cloneEmployee(e1);

        System.out.println(emp1);
        //System.out.println(e);
    }
}
