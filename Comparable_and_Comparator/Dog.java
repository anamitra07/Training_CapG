package Comparable_and_Comparator;

public class Dog implements Comparable{
    String name;
    int age;
    String breed;

    public Dog(String name, int age, String breed) {
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    public String toString() {
        return name+" "+age+" "+breed;
    }

    @Override
    public int compareTo(Object o) {
        Dog d = (Dog) o;;
            return this.age-d.age;
    }
}
