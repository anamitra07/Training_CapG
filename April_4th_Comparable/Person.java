package April_4th_Comparable;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name+" "+age;
    }

    public int compareTo(Object o) {
        Person p = (Person) o;

        int isNameSame = this.name.compareToIgnoreCase(p.name);

        int isAgeSame = this.age - p.age;

        return isNameSame==0 ? isAgeSame : isNameSame;
    }
}
