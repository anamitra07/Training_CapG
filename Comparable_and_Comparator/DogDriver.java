package Comparable_and_Comparator;

import java.util.Arrays;

public class DogDriver {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog("Tom",15,"Labrador");
        dogs[1] = new Dog("Tom",17,"Siberian Husky");
        dogs[2] = new Dog("Ben",18,"German Shephard");

        CompareByBreed c =new CompareByBreed();

        Arrays.sort(dogs,c);

        for(Dog a: dogs)
            System.out.print(a.name+" "+a.age+" "+" "+a.breed);
    }
}
