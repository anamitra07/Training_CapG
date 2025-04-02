package April_2nd_String_buffer;

public class Buffer {
    public static void main(String[] args) {

        System.out.println("\nTrying append method: ");
        StringBuffer sb1 = new StringBuffer();
        sb1.append(false);
        sb1.append(" Hello");
        System.out.println(sb1);

        System.out.println("\nTrying giving string to constructor: ");
        StringBuffer sb2 = new StringBuffer("Hello World");
        System.out.println(sb2);

        System.out.println("\nGiving input as char array: ");
        char[] arr = {'h','e','l','l','o'};
        StringBuffer sb3 = new StringBuffer();
        sb3.append(arr);
        System.out.println(sb3);

        System.out.println("\nSetting new Capacity: ");
        StringBuffer sb4 = new StringBuffer(150);
        System.out.println(sb4.capacity());

        System.out.println("\nTrying delete method: ");
        sb2.delete(0,3);
        System.out.println(sb2);

        System.out.println("\nTrying insert() method: ");
        sb3.insert(1,false);
        System.out.println(sb3);

        System.out.println("\nAdding char array to a string: ");
        char[] arr2 = {'a','b','c','d'};
        sb2.insert(3,arr2,1,3);
        System.out.println(sb2);

        System.out.println(sb2.reverse());

        sb2.setCharAt(2,'a');
        System.out.println(sb2);

    }
}
