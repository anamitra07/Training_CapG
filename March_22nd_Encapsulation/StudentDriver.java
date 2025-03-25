package March_22nd_Encapsulation;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setEmail("ram@gmail.com");
        s1.setPwd("ram@gmail.com",123);

        s1.setName("ram@gmail.com",123, "Ram");
        s1.getName("ram@gmail.com",123);

        s1.setAge("ram@gmail.com",123, 22);
        s1.getAge("ram@gmail.com",123);

        s1.setGender("ram@gmail.com",123, "male");
        s1.getGender("ram@gmail.com",123);

        s1.setStream("ram@gmail.com",123, "ECE");
        s1.getStream("ram@gmail.com",123);

        s1.updatePwd("ram@gmail.com", 123, 456);
    }
}
