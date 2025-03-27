package March_27th_DownCasting;

public class Dog extends Animal{
    String breed;
     public Dog(String breed) {
         this.breed = breed;
     }

     public void sound() {
         System.out.println("Dog is barking");
     }
}
