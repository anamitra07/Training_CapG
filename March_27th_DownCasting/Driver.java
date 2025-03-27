package March_27th_DownCasting;

public class Driver {
    public static void main(String[] args) {
        Animal dogAnimal = new Dog("Siberian Husky");
        dogAnimal.sound();
        String dogBreed = ((Dog)dogAnimal).breed;
        System.out.println(dogBreed);
        dogAnimal.sound();
        System.out.println("-----------------------------");
    }
}
