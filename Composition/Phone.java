package Composition;

/******************************

 Created by: Anamitra Kanjilal
 Date: 24th_March
 Time: 11.07 am
 *******************************/
public class Phone {
    String phoneName;
    Battery b;

    public Phone(String phoneName, String type) {
        this.phoneName = phoneName;
        this.b = new Battery(type);
    }

    public void display(){
        System.out.println(phoneName + " has " + b.type + " battery!!");
    }
}
