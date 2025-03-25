package March_21st_Static_and_Nonstatic;

/*****************************
 Created by: Anamitra Kanjilal
 Date: 21-03-2025
 Time: 16:17
 ******************************/
public class Demo2 {
    public Demo2(){
        System.out.println(Demo1.id);
        Demo1 d = new Demo1();
        System.out.println(d.name);
    }

    public static void main(String[] args) {
        
    }
}
